package com.example.functionprogramming.util.printer;

import com.example.functionprogramming.delegation.ConsolePrinter;
import com.example.functionprogramming.delegation.FilePrinter;
import com.example.functionprogramming.delegation.Printer;
import com.example.functionprogramming.delegation.RealPrinter;
import com.example.functionprogramming.error.exception.PrinterArgumentException;

/**
 * Factory Class for Printers
 *
 * @author Abdelaziz Said
 */
public class PrinterFactory {

    private PrinterFactory() {
    }

    /**
     * Retrieves an instance of a Printer based on the specified type.
     *
     * @param type the type of Printer to retrieve.
     *             Valid values are "filePrinter", "consolePrinter", and "realPrinter".
     * @return an instance of the requested Printer type.
     * Returns null if an invalid type is provided.
     */
    public static Printer getPrinter(Printers type) throws PrinterArgumentException {
        switch (type) {
            case FILE_PRINTER:
                return new FilePrinter();
            case CONSOLE_PRINTER:
                return new ConsolePrinter();
            case REAL_PRINTER:
                return new RealPrinter();
            default:
                throw new PrinterArgumentException("The passed type: " + type.name() + " is Illegal");
        }
    }
}
