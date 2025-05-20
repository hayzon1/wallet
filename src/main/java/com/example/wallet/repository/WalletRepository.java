package com.example.wallet.repository;

import com.example.wallet.model.Wallet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//@RequiredArgsConstructor
@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByWalletId(String walletId);


}
