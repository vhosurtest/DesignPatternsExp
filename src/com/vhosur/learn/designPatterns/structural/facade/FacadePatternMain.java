package com.vhosur.learn.designPatterns.structural.facade;

public class FacadePatternMain {
    public static void main(String[] args) {
        var twitterFacade = new TwitterFacade("appKey", "appSecret");
        twitterFacade.getRecentTweets();
    }
}
