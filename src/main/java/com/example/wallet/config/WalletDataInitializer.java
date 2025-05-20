//package com.example.wallet.config;
//
//import com.example.wallet.model.Wallet;
//import com.example.wallet.repository.WalletRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class WalletDataInitializer {
//
//    @Bean
//    public CommandLineRunner initWallets(WalletRepository walletRepository) {
//        return args -> {
//            // Only populate if database is empty
//            if (walletRepository.count() == 0) {
//                walletRepository.save(new Wallet(null, "W001", "jughead", 1000.0));
//                walletRepository.save(new Wallet(null, "W002", "basit", 500.0));
//                walletRepository.save(new Wallet(null, "W003", "hayzon", 750.0));
//
//                System.out.println("Initial wallet data populated successfully");
//            }
//        };
//    }
//}