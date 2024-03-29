package com.siwuxie095.designpattern.category.chapter1st.example2nd;

/**
 * 绿头鸭
 *
 * @author Jiajing Li
 * @date 2019-08-05 20:38:24
 */
class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    void display() {
        // 外观是绿头
        System.out.println("外观是绿头");
    }

    @Override
    public void fly() {
        System.out.println("飞行");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
