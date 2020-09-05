package com.vhosur.learn.designPatterns.behavioral.command.basic;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Button;

public class CommandPatternMain {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var addCustomerCommand = new AddCustomerCommand(customerService);

        //Using Button class from fx framework
        var addCustomerButton = new Button(addCustomerCommand);
        addCustomerButton.click();
    }
}
