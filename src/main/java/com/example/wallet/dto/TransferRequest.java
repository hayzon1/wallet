package com.example.wallet.dto;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public class TransferRequest {
    private String senderWalletId;
    private String receiverWalletId;
    private double amount;

    // getters
    public String getSenderWalletId() {
        return senderWalletId;
    }

    public String getReceiverWalletId() {
        return receiverWalletId;
    }

    public double getAmount() {
        return amount;
    }

    //setters
    public void setSenderWalletId(String senderWalletId) {
        this.senderWalletId = senderWalletId;
    }

    public void setReceiverWalletId(String receiverWalletId) {
        this.receiverWalletId = receiverWalletId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}