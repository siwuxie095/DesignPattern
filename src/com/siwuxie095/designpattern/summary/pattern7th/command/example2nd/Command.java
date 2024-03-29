package com.siwuxie095.designpattern.summary.pattern7th.command.example2nd;

/**
 * 命令
 *
 * @author Jiajing Li
 * @date 2019-10-29 09:52:51
 */
abstract class Command {

    /**
     * 执行命令：接收者的相关动作被调用
     */
    abstract void execute();

    /**
     * 撤销命令：接收者的相关动作被调用
     */
    abstract void undo();

}
