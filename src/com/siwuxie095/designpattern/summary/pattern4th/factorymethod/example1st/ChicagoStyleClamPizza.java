package com.siwuxie095.designpattern.summary.pattern4th.factorymethod.example1st;

/**
 * 芝加哥风味的蛤蜊比萨
 *
 * @author Jiajing Li
 * @date 2019-10-12 10:37:19
 */
class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        this.name = "Chicago Style Clam Pizza";
        this.dough = "Chicago Style Dough For Clam";
        this.sauce = "Chicago Style Sauce For Clam";
        this.toppings.add("Chicago Style Topping For Clam");
    }
}
