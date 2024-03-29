package com.siwuxie095.designpattern.category.chapter14th.example18th;

/**
 * 访问者
 *
 * @author Jiajing Li
 * @date 2019-11-11 23:44:44
 */
abstract class Visitor {

    abstract void visit(ConcreteElementA concreteElementA);

    abstract void visit(ConcreteElementB concreteElementB);

}
