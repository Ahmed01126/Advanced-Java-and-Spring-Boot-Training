package com.spring.jpa.util.designpattern.chainofresponsibility;

public class HandlerA implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public String handleRequest(String request) {
        if (request.equals("Request A")) {
            System.out.println("Handling Request A!!");
            return "Handling Request A!!";
        } else if (nextHandler != null) {
            System.out.println("Next Handler of A");
            nextHandler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("The chain of handlers is broken with:" + request);
        }
        return null;
    }
}
