package com.pioneers.docker.util.designpattern.chainofresponsibility;

public class HandlerC implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }

    @Override
    public String handleRequest(String request) {
        if (request.equals("Request C")) {
            System.out.println("Handling Request C!!");
            return "Handling Request C!!";
        } else if (nextHandler != null) {
            System.out.println("Next Handler of C");
            nextHandler.handleRequest(request);
        } else {
            throw new IllegalArgumentException("The chain of handlers is broken with:" + request);
        }
        return null;
    }
}
