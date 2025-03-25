package com.pioneers.docker.controller.chainofresponsibility;

import com.pioneers.docker.util.designpattern.chainofresponsibility.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chainOfResponsibility")
public class ChainOfResponsibilityController {

    @PostMapping("{request}")
    public String handleRequestApi(@PathVariable String request) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();
        Handler handlerD = new HandlerD();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
        handlerC.setNextHandler(handlerD);

        return handlerA.handleRequest(request);
    }
}
