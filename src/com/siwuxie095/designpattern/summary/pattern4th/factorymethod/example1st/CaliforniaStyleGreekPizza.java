package com.siwuxie095.designpattern.summary.pattern4th.factorymethod.example1st;

/**
 * 加州风味的希腊比萨
 *
 * @author Jiajing Li
 * @date 2019-10-12 10:34:53
 */
class CaliforniaStyleGreekPizza extends Pizza {

    public CaliforniaStyleGreekPizza() {
        this.name = "California Style Greek Pizza";
        this.dough = "California Style Dough For Greek";
        this.sauce = "California Style Sauce For Greek";
        this.toppings.add("California Style Topping For Greek");
    }
}
