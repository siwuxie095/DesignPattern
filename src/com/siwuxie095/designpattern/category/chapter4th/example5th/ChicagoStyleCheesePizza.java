package com.siwuxie095.designpattern.category.chapter4th.example5th;

/**
 * 芝加哥风味的芝士比萨
 *
 * @author Jiajing Li
 * @date 2019-10-12 10:34:25
 */
class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.name = "Chicago Style Cheese Pizza";
        this.dough = "Chicago Style Dough For Cheese";
        this.sauce = "Chicago Style Sauce For Cheese";
        this.toppings.add("Chicago Style Topping For Cheese");
    }
}
