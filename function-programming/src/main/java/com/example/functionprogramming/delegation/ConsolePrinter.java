package com.example.functionprogramming.delegation;

import lombok.extern.slf4j.Slf4j;


/**
 * Delegated Class to print message into the console.
 *
 * @author Abdelziz Said
 */
@Slf4j
public class ConsolePrinter implements Printer {

    /**
     * Prints message into Console.
     *
     * @param message message need to be printed
     */
    @Override
    public void print(String message) {
        log.info("Printing {} into console", message);
    }
}
