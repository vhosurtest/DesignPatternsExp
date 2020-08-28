package com.vhosur.learn.designPatterns.behavioral.mediator;

public class SignupDialogBox {
    UsernameTextBox usernameTextBox = new UsernameTextBox();
    PasswordTextBox passwordTextBox = new PasswordTextBox();
    LicenseAgreementCheckBox licenseAgreementCheckBox = new LicenseAgreementCheckBox();
    SignupButton signupButton = new SignupButton();

    public SignupDialogBox() {
        this.usernameTextBox.addObserver(this::usernameChanged);
        this.passwordTextBox.addObserver(this::passwordChanged);
        this.licenseAgreementCheckBox.addObserver((this::licenseAgreementChanged));
    }

    public void simulateUserBehavior() {
        System.out.println(this.signupButton.isEnabled());
        this.usernameTextBox.setContent("vhosur");
        System.out.println(this.signupButton.isEnabled());
        this.passwordTextBox.setContent("D00rb3pp");
        System.out.println(this.signupButton.isEnabled());
        this.licenseAgreementCheckBox.setChecked(true);
        System.out.println(this.signupButton.isEnabled());
        this.licenseAgreementCheckBox.setChecked(false);
        System.out.println(this.signupButton.isEnabled());
    }

    private void usernameChanged() {
        this.changeButtonStatus();
    }

    private void passwordChanged() {
        this.changeButtonStatus();
    }

    private void licenseAgreementChanged() {
        this.changeButtonStatus();
    }

    private boolean conditionsMet() {
        return !this.usernameTextBox.getContent().isEmpty()
                && !this.passwordTextBox.getContent().isEmpty()
                && this.licenseAgreementCheckBox.isChecked();
    }

    private void changeButtonStatus() {
        this.signupButton.setEnabled(this.conditionsMet());
    }
}
