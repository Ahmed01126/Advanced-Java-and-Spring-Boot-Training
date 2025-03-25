package com.pioneers.docker.util.designpattern.chainofresponsibility;

public interface Handler {

    void setNextHandler(Handler handler);

    String handleRequest(String request);
}
