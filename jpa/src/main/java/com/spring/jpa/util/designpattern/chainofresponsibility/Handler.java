package com.spring.jpa.util.designpattern.chainofresponsibility;

public interface Handler {

    void setNextHandler(Handler handler);

    String handleRequest(String request);
}
