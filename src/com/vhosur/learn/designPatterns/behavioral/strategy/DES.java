package com.vhosur.learn.designPatterns.behavioral.strategy;

public class DES implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES algorithm");
    }
}
