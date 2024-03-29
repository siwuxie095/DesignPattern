package com.siwuxie095.designpattern.summary.pattern18th.flyweight.example2nd;

/**
 * 具体享元类
 *
 * @author Jiajing Li
 * @date 2019-11-11 18:24:47
 */
class ConcreteFlyweight extends Flyweight {

    ConcreteFlyweight(String intrinsic) {
        super(intrinsic);
    }

    @Override
    void operation(String extrinsic) {
        System.out.println("具体享元的内部状态：" + getIntrinsic() + "，外部状态：" + extrinsic);
    }
}
