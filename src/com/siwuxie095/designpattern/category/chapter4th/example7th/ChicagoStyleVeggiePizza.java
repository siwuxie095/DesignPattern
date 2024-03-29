package com.siwuxie095.designpattern.category.chapter4th.example7th;

/**
 * 芝加哥风味的素食比萨
 *
 * @author Jiajing Li
 * @date 2019-10-14 10:51:53
 */
class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago Style Veggie Pizza";
        this.dough = "Chicago Style Dough For Veggie";
        this.sauce = "Chicago Style Sauce For Veggie";
        this.toppings.add("Chicago Style Topping For Veggie");
    }
}
