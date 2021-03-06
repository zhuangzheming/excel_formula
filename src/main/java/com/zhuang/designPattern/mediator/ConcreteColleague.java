package com.zhuang.designPattern.mediator;

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        notify(message);
    }

    public void notify(String message) {
        System.out.println("同事得到消息" + message);
    }
}
