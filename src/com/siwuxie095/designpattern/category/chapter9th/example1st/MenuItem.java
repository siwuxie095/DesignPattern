package com.siwuxie095.designpattern.category.chapter9th.example1st;

/**
 * 菜单项
 *
 * @author Jiajing Li
 * @date 2019-11-05 22:08:12
 */
class MenuItem {

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否素食
     */
    private boolean vegetarian;

    /**
     * 价格
     */
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " $" + price + " " + description;
    }
}
