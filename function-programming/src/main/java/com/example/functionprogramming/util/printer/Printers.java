package com.example.functionprogramming.util.printer;

import com.example.functionprogramming.error.exception.PrinterArgumentException;

public enum Printers {
    FILE_PRINTER("fp"),
    CONSOLE_PRINTER("cp"),
    REAL_PRINTER("rp");

    private String code;

    Printers() {
    }

    Printers(String code) {
        this.code = code;
    }

    public static Printers fromString(String type) {
        try {
            return Printers.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new PrinterArgumentException("The passed type: " + type + " is Illegal");
        }
    }

    public static Printers fromCode(String code) {
        for (Printers value : Printers.values()) {
            if (value.code.equals(code.toLowerCase())) {
                return value;
            }
        }
        throw new PrinterArgumentException("The passed type: " + code + " is Illegal");
    }


}
