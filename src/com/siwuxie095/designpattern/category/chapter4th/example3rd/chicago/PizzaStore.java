package com.siwuxie095.designpattern.category.chapter4th.example3rd.chicago;

/**
 * 比萨店
 *
 * @author Jiajing Li
 * @date 2019-10-12 10:36:09
 */
class PizzaStore {

    private ChicagoPizzaFactory factory;

    public PizzaStore(ChicagoPizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = factory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
