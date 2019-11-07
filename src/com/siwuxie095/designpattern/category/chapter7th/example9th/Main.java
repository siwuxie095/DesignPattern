package com.siwuxie095.designpattern.category.chapter7th.example9th;

/**
 * @author Jiajing Li
 * @date 2019-11-05 00:00:45
 */
public class Main {

    /**
     * 将方法调用保持在界限内
     *
     * 以汽车类 Car 为例，展示调用方法的各种做法，同时还能够
     * 遵守最少知识原则。
     *
     *
     * 疑问与解答：
     *
     * 问：
     * 还有另一个原则，叫做迪米特法则（Law of Demeter），
     * 它和最少知识原则有什么关系？
     * 答：
     * 其实两个名字指的是同一个原则。这里更倾向于使用最少知识
     * 原则来称呼它是因为以下两个原因：（1）这个名字更直接。
     * （2）法则（Law）给人的感觉是强制的。事实上，没有任何原
     * 则是法律（Law），所有的原则都应该在有帮助的时候才遵守。
     * 所有的设计都不免需要折衷（在抽象和速度之间取舍，在空间
     * 和时间之间平衡...）。虽然原则提供了方针，但是在采用原
     * 则之前，必须全盘考虑所有的因素。
     *
     * 问：
     * 采用最少知识原则有什么缺点吗？
     * 答：
     * 是的，虽然这个原则减少了对象之间的依赖，研究显示这会减少
     * 软件的维护成本，但是采用这个原则也会导致更多的 "包装" 类
     * 被制造出来，以处理和其他组件的沟通，这可能会导致复杂度和
     * 开发时间的增加，并降低运行时的性能。
     *
     *
     * 外观和最少知识原则
     *
     * Client 只有一个朋友，也就是 Facade。在 OO 编程中，
     * "只有一个朋友" 是件好事情。
     *
     * Facade 帮助 Client 管理全部子系统组件，它的存在让
     * Client 变得简单又有弹性。
     *
     * 可以在不影响 Client 的情况下，升级子系统的组件。
     *
     * 当然也可以试着让子系统也能遵守最少知识原则。如果变得
     * 太复杂，有太多朋友牵涉其中，那么可以增加更多的外观，
     * 将此子系统分成几个层次。
     */
    public static void main(String[] args) {
        Car car = new Car();

        Key key = new Key();
        car.start(key);
    }

}