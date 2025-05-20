package com.example.wallet.dto;


import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
public class TransferResponse {
    private String message;
    private double amount;
    private double fee;
    private double senderNewBalance;
    private double receiverNewBalance;

    public TransferResponse(String message, double amount, double fee,
                            double senderNewBalance, double receiverNewBalance) {
        this.message = message;
        this.amount = amount;
        this.fee = fee;
        this.senderNewBalance = senderNewBalance;
        this.receiverNewBalance = receiverNewBalance;
    }

    public TransferResponse() {
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}