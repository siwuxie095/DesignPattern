package com.siwuxie095.designpattern.category.chapter3rd.example1st;

/**
 * @author Jiajing Li
 * @date 2019-09-14 17:27:15
 */
public class Main {


    /**
     * 星巴兹（Starbuzz）是以扩张速度最快而闻名的咖啡连锁店。因为扩张的速度是在太快，他们准备更新订单系统，以合乎他们
     * 的饮料供应需求。他们原先的类的设计是这样：
     *
     * Beverage（饮料）是一个抽象类，店内所有的饮料都必须继承自此类。现有的饮料有：
     * HouseBlend（黑咖啡）、DarkRoast（深焙咖啡）、Decaf（脱咖啡因咖啡）、Espresso（意大利咖啡）。
     *
     * 购买咖啡时也可以要求在其中加入各种调料，例如：SteamedMilk（蒸奶）、Soy（豆浆）、Mocha（摩卡）、Whip（奶泡）。
     *
     * 星巴兹会根据所加入的调料收取不同的费用，所以订单系统必须考虑到这些调料部分。
     *
     * 本例是他们的第一次尝试，有饮料本身的类，也有带各种调料的饮料的类。但很显然，这样简直是 "类爆炸"。
     *
     * 星巴兹为自己制造了一个维护噩梦。如果蒸奶的价格上扬，怎么办？新增一种焦糖调料风味时，怎么办？
     *
     * 造成这种维护上的困难，违反了之前提到的两个设计原则：
     * 1、九个 OO 原则之第三个设计原则：找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要
     * 变化的代码放在一起。
     * 2、九个 OO 原则之第三个设计原则：多用组合，少用继承。
     */
    public static void main(String[] args) {

    }

}
