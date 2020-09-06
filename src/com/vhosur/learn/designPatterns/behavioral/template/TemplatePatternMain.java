package com.vhosur.learn.designPatterns.behavioral.template;

public class TemplatePatternMain {
    public static void main(String[] args) {
        var appWindow = new AppWindow();
        var browserWindow = new BrowserWindow();
        var gameWindow = new GameWindow();

        appWindow.close();
        browserWindow.close();
        gameWindow.close();
    }
}
