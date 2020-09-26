package com.vhosur.learn.designPatterns.structural.adapter;

import com.vhosur.learn.designPatterns.structural.adapter.gmail.GmailClient;

public class GmailProviderAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailProviderAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
