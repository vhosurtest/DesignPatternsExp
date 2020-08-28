package com.vhosur.learn.designPatterns.behavioral.chainOfResponsibility;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        var quickBooksHandler = new QuickBooksHandler(null);
        var numbersHandler = new NumbersHandler(quickBooksHandler);
        var excelHandler = new ExcelHandler(numbersHandler);
        var dataReader = new DataReader(excelHandler);

        dataReader.handle("somefile.qbs");
    }
}
