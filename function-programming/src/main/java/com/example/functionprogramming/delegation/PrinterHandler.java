package com.example.functionprogramming.delegation;

/**
 * Delegator Class that delegate printing functionality to the delegated classes.
 *
 * @author Abdelziz Said
 */
public class PrinterHandler {

    private final Printer printer;

    public PrinterHandler(Printer printer) {
        this.printer = printer;
    }

    public void print(String message) {
        printer.print(message);
    }
}
