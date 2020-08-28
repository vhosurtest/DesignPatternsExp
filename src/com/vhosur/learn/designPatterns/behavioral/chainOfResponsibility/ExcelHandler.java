package com.vhosur.learn.designPatterns.behavioral.chainOfResponsibility;

public class ExcelHandler extends Handler {

    public ExcelHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(String filename) {
        boolean isHandled = false;
        if (filename.endsWith(".xls")) {
            System.out.println("Processing excel file");
            isHandled = true;
        }
        return isHandled;
    }
}
