package com.example.functionprogramming.controller;

import com.example.functionprogramming.delegation.Printer;
import com.example.functionprogramming.delegation.PrinterHandler;
import com.example.functionprogramming.util.printer.PrinterFactory;
import com.example.functionprogramming.util.printer.Printers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delegation")
public class DelegationController {

    @PostMapping("/print/{printerType}")
    public void printApi(@RequestParam String message, @PathVariable String printerType) {
        Printers printerEnum = Printers.fromString(printerType);
        Printer printer = PrinterFactory.getPrinter(printerEnum);

        PrinterHandler teamLeader = new PrinterHandler(printer);
        teamLeader.print(message);
    }
}
