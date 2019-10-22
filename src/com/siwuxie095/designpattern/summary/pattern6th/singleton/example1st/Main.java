package com.siwuxie095.designpattern.summary.pattern6th.singleton.example1st;

/**
 * @author Jiajing Li
 * @date 2019-10-22 17:49:44
 */
public class Main {

    /**
     * 延迟实例化（懒汉模式）
     *
     * 线程不安全
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }

}
