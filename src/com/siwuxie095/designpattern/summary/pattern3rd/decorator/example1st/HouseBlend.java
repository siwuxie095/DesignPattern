package com.siwuxie095.designpattern.summary.pattern3rd.decorator.example1st;

/**
 * 黑咖啡（具体组件）
 *
 * @author Jiajing Li
 * @date 2019-10-10 11:39:09
 */
class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
