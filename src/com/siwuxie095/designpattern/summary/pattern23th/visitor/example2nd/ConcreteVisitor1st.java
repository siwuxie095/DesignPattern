package com.siwuxie095.designpattern.summary.pattern23th.visitor.example2nd;

/**
 * 一号具体访问者
 *
 * @author Jiajing Li
 * @date 2019-11-11 23:48:12
 */
class ConcreteVisitor1st extends Visitor {

    @Override
    void visit(ConcreteElementA concreteElementA) {
        System.out.println("一号具体访问者访问：" + concreteElementA.operation());
    }

    @Override
    void visit(ConcreteElementB concreteElementB) {
        System.out.println("一号具体访问者访问：" + concreteElementB.operation());
    }
}
