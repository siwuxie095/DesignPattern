package com.siwuxie095.designpattern.category.chapter12th.example1st;

/**
 * 绿头鸭
 *
 * @author Jiajing Li
 * @date 2019-11-10 09:15:36
 */
class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
