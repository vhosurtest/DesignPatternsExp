package com.vhosur.learn.designPatterns.behavioral.command.basic;

import com.vhosur.learn.designPatterns.behavioral.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public void execute() {
        this.customerService.addCustomer();
    }
}
