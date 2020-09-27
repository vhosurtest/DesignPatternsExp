package com.vhosur.learn.designPatterns.structural.facade;

import java.util.List;

public class TwitterFacade {
    private String appKey;
    private String appSecret;

    public TwitterFacade(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public List<Tweet> getRecentTweets() {
        var accessToken = this.getAccessToken();
        var twitterClient = new TwitterClient();

        return twitterClient.getRecentTweets(accessToken);
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(this.appKey, this.appSecret);
        return oauth.getAccessToken(requestToken);
    }
}
