package com.siwuxie095.designpattern.summary.pattern4th.factorymethod.example1st;

/**
 * 纽约风味的腊肠比萨
 *
 * @author Jiajing Li
 * @date 2019-10-12 10:35:31
 */
class NewYorkStylePepperoniPizza extends Pizza {

    public NewYorkStylePepperoniPizza() {
        this.name = "New York Style Pepperoni Pizza";
        this.dough = "New York Style Dough For Pepperoni";
        this.sauce = "New York Style Sauce For Pepperoni";
        this.toppings.add("New York Style Topping For Pepperoni");
    }

}
