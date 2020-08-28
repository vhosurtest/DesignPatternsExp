package com.vhosur.learn.designPatterns.behavioral.mediator;

public class CheckBox extends UIControl {
    protected boolean checked = false;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
        this.notifyObservers();
    }
}
