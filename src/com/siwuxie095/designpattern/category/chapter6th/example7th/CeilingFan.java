package com.siwuxie095.designpattern.category.chapter6th.example7th;

/**
 * 吊扇（接收者）
 *
 * @author Jiajing Li
 * @date 2019-10-29 17:43:19
 */
class CeilingFan {

    /**
     * 速度
     */
    private int speed;

    static final int HIGH = 5;

    static final int MEDIUM = 3;

    static final int LOW = 1;

    static final int OFF = 0;

    /**
     * 高速
     */
    void high() {
        speed = HIGH;
        System.out.println("将吊扇设为高速");
    }

    /**
     * 中速
     */
    void medium() {
        speed = MEDIUM;
        System.out.println("将吊扇设为中速");
    }

    /**
     * 低速
     */
    void low() {
        speed = LOW;
        System.out.println("将吊扇设为低速");
    }

    /**
     * 关闭
     */
    void off() {
        speed = OFF;
        System.out.println("将吊扇设为关闭");
    }

    int getSpeed() {
        return speed;
    }

}
