package com.siwuxie095.designpattern.category.chapter8th.example3rd;

/**
 * 茶
 *
 * @author Jiajing Li
 * @date 2019-11-05 13:49:27
 */
class Tea extends CaffeineBeverage {


    /**
     * 用沸水浸泡茶叶
     */
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    /**
     * 加柠檬
     */
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
