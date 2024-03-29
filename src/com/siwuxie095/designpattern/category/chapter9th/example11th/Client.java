package com.siwuxie095.designpattern.category.chapter9th.example11th;

/**
 * 客户
 *
 * @author Jiajing Li
 * @date 2019-11-06 23:41:38
 */
class Client {

    /**
     * 持有对最顶层组件的引用（相对）
     */
    private Component allComponents;

    public Client(Component allComponents) {
        this.allComponents = allComponents;
    }

    void doSomething() {
        allComponents.operation();
    }
}
