package com.example.wallet.controller;

import com.example.wallet.dto.TransferRequest;
import com.example.wallet.dto.TransferResponse;
import com.example.wallet.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wallets")
//@RequiredArgsConstructor
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/transfer")
    public ResponseEntity<TransferResponse> transferFunds(@RequestBody TransferRequest request) {
        TransferResponse response = walletService.transferFunds(request);
        return ResponseEntity.ok(response);
    }
}