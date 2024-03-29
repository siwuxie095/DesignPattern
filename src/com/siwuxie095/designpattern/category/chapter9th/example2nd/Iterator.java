package com.siwuxie095.designpattern.category.chapter9th.example2nd;

/**
 * 迭代器
 *
 * @author Jiajing Li
 * @date 2019-11-06 08:32:31
 */
interface Iterator {

    /**
     * 是否还有下一个元素
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     */
    Object next();

}
