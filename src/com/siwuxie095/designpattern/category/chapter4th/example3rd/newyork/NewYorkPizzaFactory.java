package com.siwuxie095.designpattern.category.chapter4th.example3rd.newyork;

/**
 * 纽约比萨工厂
 *
 * @author Jiajing Li
 * @date 2019-10-12 14:04:52
 */
class NewYorkPizzaFactory {

    Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;

        if (pizzaType == PizzaType.CHEESE) {
            pizza = new NewYorkStyleCheesePizza();
        } else if (pizzaType == PizzaType.GREEK) {
            pizza = new NewYorkStyleGreekPizza();
        } else if (pizzaType == PizzaType.PEPPERONI) {
            pizza = new NewYorkStylePepperoniPizza();
        } else if (pizzaType == PizzaType.CLAM) {
            pizza = new NewYorkStyleClamPizza();
        } else if (pizzaType == PizzaType.VEGGIE) {
            pizza = new NewYorkStyleVeggiePizza();
        }

        return pizza;
    }

}
