package com.siwuxie095.designpattern.category.chapter8th.example7th;

import java.util.Arrays;

/**
 * @author Jiajing Li
 * @date 2019-11-05 17:01:35
 */
public class Main {

    /**
     * Java API 中的模板方法模式
     *
     * 模板方法模式是一个很常见的模式，到处都是。但在看的过程中却要留意，
     * 因为模板方法模式有许多实现，而且它们看起来并不一定和标准定义一致。
     *
     * 这个模式很常见是因为对创建框架来说，这个模式很好。由框架控制如何
     * 做事情，而由使用这个框架的人指定框架算法中每个步骤的细节。
     *
     * 例如：
     * Java API 中的数组排序，就提供了一个模板方法，即 Arrays.sort()。
     * 该模板方法依赖于 compareTo() 方法的实现来完成算法。
     *
     * 即 compareTo() 方法可以看作是基类中的抽象方法，需要实现该方法来
     * "填补" 模板方法的缺憾。
     *
     * 至于比较后的 swap() 方法则可以看作是一个具体方法。
     *
     *
     * 假如有一个鸭子的数组需要排序，你要怎么做？
     *
     * 数组的排序模板已经提供了算法，但是你必须让这个模板方法知道如何比较
     * 鸭子。即 所要做的事情就是实现一个 compareTo() 方法。
     *
     * 但众所周知，模板方法通常是通过继承的方式来实现的，这里的数组显然无
     * 法继承。所以，似乎没有任何道理。
     *
     * 可以这么理解：sort() 的设计者希望这个方法能使用于所有的数组，所以
     * 它们把 sort() 变成是静态方法，这样一来，任何数组都可以使用这个方法。
     * 但是没关系，它使用起来和它被定义在基类中是一样的。
     *
     * 另外：因为 sort() 并不是真正定义在基类中，所以 sort() 方法需要知
     * 道你已经实现了 compareTo() 方法，否则就无法进行排序。要达到这一点，
     * 设计者利用了 Comparable 接口。需要实现这个接口，提供这个接口所声明
     * 的方法，也就是 compareTo() 方法。
     *
     * compareTo() 方法将比较两个对象，然后返回其中一个是大于、等于、还
     * 是小于另一个。sort() 只要能够知道两个对象的大小，当然就可以进行排
     * 序。
     *
     *
     * 疑问与解答：
     *
     * 问：
     * 这真的是一个模板方法模式吗？还是你的想象力太丰富了？
     * 答：
     * 这个模式的重点在于提供一个算法，并让子类实现某些步骤，而数组的排序
     * 做法很明显地并非如此。但是，真实世界的模板方法并非总是如同教科书例
     * 子一般地中规中矩，为了符合当前的环境和实现的约束，它们总是要被适当
     * 的修改。
     * Arrays 类 sort() 方法的设计者受到一些约束。通常无法设计一个类继
     * 承 Java 数组，而 sort() 希望能适用于所有的数组（每个数组都是不同
     * 的类）。所以它们定义了一个静态方法，而由被排序的对象内的每个元素自
     * 行提供比较大小的算法部分。所以，这虽然不是教科书上的模板方法，但它
     * 的实现仍然符合模板方法模式的精神。再者，由于不需要继承数组就可以使
     * 用这个算法，这样使得排序变得更有弹性、更有用。
     *
     * 问：
     * 排序的实现实际上看起来更像是策略模式，而不是模板方法模式。为什么要
     * 将它归为模板方法？
     * 答：
     * 你之所以会这么认为，可能是因为策略模式使用对象组合。在某种程度上，
     * 你是对的。我们使用数组对象排序数组，这部分和策略模式非常相似。但
     * 是请记住，在策略模式中，你所组合的类实现了整个算法。数组所实现的
     * 排序算法并不完成，它需要一个类填补 compareTo() 方法的实现。因
     * 此，我们认为这更像模板方法。
     *
     * 问：
     * 在 Java API 中，还有其他模板方法的例子吗？
     * 答：
     * 有的，比如，java.io 的 InputStream 类有一个 read() 方法，是
     * 由子类实现的，而这个方法又会被 read(byte[] b, int off, int len)
     * 模板方法使用。
     */
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("A", 8),
                new Duck("B", 2),
                new Duck("C", 7),
                new Duck("D", 2),
                new Duck("E", 10),
                new Duck("F", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println();

        System.out.println("After sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }

}
