package com.example.functionprogramming.delegation;

import lombok.extern.slf4j.Slf4j;

/**
 * Delegated Class to print message into real paper.
 *
 * @author Abdelziz Said
 */
@Slf4j
public class RealPrinter implements Printer {
    @Override
    public void print(String message) {
        log.info("Printing {} into real paper using real printer!!", message);
    }
}
