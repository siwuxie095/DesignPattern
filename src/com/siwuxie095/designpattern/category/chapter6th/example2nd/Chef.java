package com.siwuxie095.designpattern.category.chapter6th.example2nd;

/**
 * 厨师（接收者 Receiver）
 *
 * @author Jiajing Li
 * @date 2019-10-28 14:55:27
 */
class Chef {

    void wash() {
        System.out.println("厨师在洗菜...");
    }

    void cut() {
        System.out.println("厨师在切菜...");
    }

    void cook() {
        System.out.println("厨师在炒菜...");
    }

}
