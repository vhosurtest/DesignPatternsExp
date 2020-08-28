package com.vhosur.learn.designPatterns.behavioral.mediator;

public class Button extends UIControl{
    protected boolean enabled = false;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
