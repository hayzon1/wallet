package com.example.wallet.service;

import com.example.wallet.dto.TransferRequest;
import com.example.wallet.dto.TransferResponse;
import com.example.wallet.model.Wallet;
import com.example.wallet.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
//@RequiredArgsConstructor
public class WalletService {
    private final WalletRepository walletRepository;
    private static final double FEE_PERCENTAGE = 0.02;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Transactional
    public TransferResponse transferFunds(TransferRequest request) {
        Wallet sender = walletRepository.findByWalletId(request.getSenderWalletId())
                .orElseThrow(() -> new RuntimeException("Sender wallet not found"));

        Wallet receiver = walletRepository.findByWalletId(request.getReceiverWalletId())
                .orElseThrow(() -> new RuntimeException("Receiver wallet not found"));
        if (request.getAmount() <= 0) {
            throw new IllegalArgumentException("Transfer amount must be positive");
        }

        double fee = request.getAmount() * FEE_PERCENTAGE;
        double totalDeduction = request.getAmount() + fee;

        if (sender.getBalance() < totalDeduction) {
            return new TransferResponse(
                    "Transfer failed: insufficient funds",
                    0,
                    0,
                    sender.getBalance(),
                    receiver.getBalance()
            );
        }
        sender.setBalance(sender.getBalance() - totalDeduction);
        receiver.setBalance(receiver.getBalance() + request.getAmount());

        walletRepository.save(sender);
        walletRepository.save(receiver);

        return new TransferResponse(
                "Transfer successful",
                request.getAmount(),
                fee,
                sender.getBalance(),
                receiver.getBalance()
        );
    }
}
