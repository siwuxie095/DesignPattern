package com.siwuxie095.designpattern.summary.pattern14th.proxy.exmaple3rd;

/**
 * 真正的主题
 *
 * @author Jiajing Li
 * @date 2019-11-09 17:14:37
 */
class RealSubject implements Subject {

    /*
     * RealSubject 通常是真正做事的对象，Proxy 会控制对
     * RealSubject 对访问
     */

    @Override
    public void request() {

    }
}
