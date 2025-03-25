package com.spring.jpa.util.designpattern.chainofresponsibility;

public class HandlerD implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public String handleRequest(String request) {
        if (request.equals("Request D")) {
            System.out.println("Handling Request D!!");
            return "Handling Request D!!";
        } else if (nextHandler != null) {
            System.out.println("Next Handler of D");
            nextHandler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("The chain of handlers is broken with:" + request);
        }
        return null;
    }
}
