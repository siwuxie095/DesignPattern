package com.siwuxie095.designpattern.summary.pattern20th.mediator.example2nd;

/**
 * 一号具体同事
 *
 * @author Jiajing Li
 * @date 2019-11-11 21:22:17
 */
class ConcreteColleague1st extends Colleague {

    @Override
    void receive() {
        System.out.println("一号具体同事收到请求");
    }

    @Override
    void send() {
        System.out.println("一号具体同事发出请求");
        // 请中介者转发
        mediator.relay(this);
    }
}
