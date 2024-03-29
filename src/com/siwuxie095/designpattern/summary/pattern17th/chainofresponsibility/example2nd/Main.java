package com.siwuxie095.designpattern.summary.pattern17th.chainofresponsibility.example2nd;

/**
 * @author Jiajing Li
 * @date 2019-11-11 16:58:25
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Handler handler = client.createHandler();
        handler.handleRequest("one");
        handler.handleRequest("ten");
    }

}
