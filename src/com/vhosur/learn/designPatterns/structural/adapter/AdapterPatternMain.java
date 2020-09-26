package com.vhosur.learn.designPatterns.structural.adapter;

import com.vhosur.learn.designPatterns.structural.adapter.gmail.GmailClient;

public class AdapterPatternMain {
    public static void main(String[] args) {
        var gmailProviderAdapter = new GmailProviderAdapter(new GmailClient());
        var emailClient = new EmailClient();
        emailClient.addProvider(gmailProviderAdapter);
        emailClient.downloadEmails();
    }
}
