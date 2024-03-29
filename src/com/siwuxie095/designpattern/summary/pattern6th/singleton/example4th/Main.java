package com.siwuxie095.designpattern.summary.pattern6th.singleton.example4th;

/**
 * @author Jiajing Li
 * @date 2019-10-22 17:49:44
 */
public class Main {

    /**
     * 双重加锁检查（双重锁模式）
     *
     * 线程安全，且延迟实例化
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }

}
