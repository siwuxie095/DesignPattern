package com.siwuxie095.designpattern.category.chapter12th.example4th;

/**
 * 红头鸭
 *
 * @author Jiajing Li
 * @date 2019-11-10 09:16:24
 */
class RedheadDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
