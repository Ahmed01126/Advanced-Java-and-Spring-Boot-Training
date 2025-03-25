package com.spring.jpa.util.designpattern.chainofresponsibility;

public class HandlerB implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public String handleRequest(String request) {
        if (request.equals("Request B")) {
            System.out.println("Handling Request B!!");
            return "Handling Request B!!";
        } else if (nextHandler != null) {
            System.out.println("Next Handler of B");
            nextHandler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("The chain of handlers is broken with:" + request);
        }
        return null;
    }
}
