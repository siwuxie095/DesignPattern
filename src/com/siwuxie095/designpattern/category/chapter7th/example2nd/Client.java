package com.siwuxie095.designpattern.category.chapter7th.example2nd;

/**
 * 客户
 *
 * @author Jiajing Li
 * @date 2019-11-04 16:51:10
 */
class Client {

    void consumeTarget(Target target) {
        target.request();
    }

}
