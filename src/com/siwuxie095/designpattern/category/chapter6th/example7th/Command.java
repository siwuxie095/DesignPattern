package com.siwuxie095.designpattern.category.chapter6th.example7th;

/**
 * 命令
 *
 * @author Jiajing Li
 * @date 2019-10-29 17:46:34
 */
interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
