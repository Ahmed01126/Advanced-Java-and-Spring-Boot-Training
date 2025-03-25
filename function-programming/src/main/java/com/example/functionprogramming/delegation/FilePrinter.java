package com.example.functionprogramming.delegation;

import lombok.extern.slf4j.Slf4j;


/**
 * Delegated Class to print message into a particular file.
 *
 * @author Abdelziz Said
 */
@Slf4j
public class FilePrinter implements Printer {

    /**
     * Prints message into file.
     *
     * @param message message need to be printed
     */
    @Override
    public void print(String message) {
        log.info("Printing {} into file", message);
    }
}
