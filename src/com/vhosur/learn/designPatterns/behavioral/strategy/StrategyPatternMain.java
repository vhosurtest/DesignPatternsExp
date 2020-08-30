package com.vhosur.learn.designPatterns.behavioral.strategy;

public class StrategyPatternMain {
    public static void main(String[] args) {
        EncryptionAlgorithm encryptionAlgorithm = new DES();
        ChatClient chatClient = new ChatClient(encryptionAlgorithm);
        chatClient.encrypt("Sample message to be encrypted using DES algorithm");

        encryptionAlgorithm = new AES();
        chatClient.setEncryptionAlgorithm(encryptionAlgorithm);
        chatClient.encrypt("Sample message to be encrypted using AES algorithm");

        //We can define a custom algorithm and send it as a lambda expression
        chatClient.setEncryptionAlgorithm((message) -> System.out.println("Encrypting using custom lambda algorithm"));
        chatClient.encrypt("Sample message to be encrypted using custom lambda method algorithm");

        chatClient.setEncryptionAlgorithm(StrategyPatternMain::applyRandomAlgorithm);
        chatClient.encrypt("Sample message to be encrypted with private method");

        chatClient.setEncryptionAlgorithm(CustomAlgorithm::encrypt);
        chatClient.encrypt("Sample message to be encrypted using inner class custom algorithm");
    }

    private static void applyRandomAlgorithm(String message) {
        System.out.println("Encrypting using static method random algorithm");
    }

    private static class CustomAlgorithm {
        private static void encrypt(String message) {
            System.out.println("Encrypting with inner class custom algorithm");
        }
    }
}
