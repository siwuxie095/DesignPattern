package com.siwuxie095.designpattern.category.chapter6th.example7th;

/**
 * 车库门（接收者）
 *
 * @author Jiajing Li
 * @date 2019-10-29 17:40:07
 */
class GarageDoor {

    /**
     * 上升
     */
    void up() {
        System.out.println("将车库门上升");
    }

    /**
     * 下降
     */
    void down() {
        System.out.println("将车库门下降");
    }

    /**
     * 停止
     */
    void stop() {
        System.out.println("将车库门停止");
    }

    /**
     * 打开灯
     */
    void lightOn() {
        System.out.println("将车库门里的灯打开");
    }

    /**
     * 关闭灯
     */
    void lightOff() {
        System.out.println("将车库门门里的灯关闭");
    }
}
