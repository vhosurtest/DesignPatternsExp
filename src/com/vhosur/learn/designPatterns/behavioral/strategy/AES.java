package com.vhosur.learn.designPatterns.behavioral.strategy;

public class AES implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using AES algorithm");
    }
}
