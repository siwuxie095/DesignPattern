package com.siwuxie095.designpattern.category.chapter12th.example7th;

/**
 * 呱呱叫学家（观察者）
 *
 * @author Jiajing Li
 * @date 2019-11-10 11:42:22
 */
class Quackologist implements Observer {

    @Override
    public void update(Observable duck) {
        System.out.println("Quackologist: " + duck.getClass().getSimpleName() + " just quacked.");
    }
}
