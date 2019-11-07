package com.siwuxie095.designpattern.category.chapter6th.example8th;

/**
 * @author Jiajing Li
 * @date 2019-10-27 17:25:55
 */
public class Main {

    /**
     * 每个遥控器都需具备 "Party 模式"
     *
     * 如果拥有一个遥控器，却无法光凭一个按下按钮，就同时能打开灯光、打开音响和电视、
     * 设置好 DVD、并让热水器开始加温，那么要这个遥控器还有什么意义？
     *
     * 这时就需要制造一种新的命令，用来执行其他一堆命令...而不只是执行一个命令，这种
     * 命令称为 宏命令，即 MacroCommand。
     *
     *
     * 疑问与解答：
     *
     * 问：
     * 接收者一定有必要存在吗？为何命令对象不直接实现 execute() 方法的细节？
     * 答：
     * 一般来说，尽量设计 "傻瓜" 命令对象，它只懂得调用一个接收者的一个行为。
     * 然而，有许多 "聪明" 命令对象会实现许多逻辑，直接完成一个请求。当然是
     * 可以设计 "聪明" 的命令对象，只是这样一来，调用者和接收者之间的解耦程
     * 度是比不上 "傻瓜" 命令对象的，而且，也不能把接收者当作参数传给命令。
     *
     * 问：
     * 如何能够实现多层次的撤销操作？换句话说，希望能够按下撤销按钮许多次，
     * 撤销到很早很早以前的状态。
     * 答：
     * 好问题。其实这相当容易做到，不要只记录最后一个被执行的命令，而使用一个
     * 堆栈记录操作过程的每一个命令。然后，不管什么时候按下了撤销按钮，你都可
     * 以从堆栈中取出最上层的命令，然后调用它的 undo() 方法。
     *
     * 问：
     * 可不可以创建一个 PartyCommand，然后在它的 execute() 方法中调其他的
     * 命令，利用这种做法实现 Party 模式吗？
     * 答：
     * 可以这么做。然而，这等于把 Party 模式硬编码到 PartyCommand 中，为什
     * 么要这么麻烦呢？利用宏命令，可以动态地决定 PartyCommand 是由哪些命令
     * 组成，所以宏命令在使用上更灵活。一般来说，宏命令的做法更优雅，也需要较
     * 少的新代码。
     *
     *
     * 命令模式的更多用途之一：队列请求
     *
     * 命令可以将运算块打包（一个接收者和一组动作），然后将它传来传去，就像是
     * 一般的对象一样。现在，即使在命令对象被创建许久之后，运算依然可以被调用。
     * 事实上，它甚至可以在不同的线程中被调用。可以利用这样的特性衍生一些应用，
     * 例如：日程安排、线程池、工作队列等。
     *
     * 想象有一个工作队列：你在某一端添加命令，然后另一端则是线程。线程进行下
     * 面的动作：从队列中取出一个命令，调用它的 execute() 方法，等待这个调
     * 用完成，然后将此命令对象丢弃，再取出下一个命令 ...
     *
     * 请注意，工作队列类和进行计算的对象之间是完全解耦的。此刻线程可能在进行
     * 财务运算，下一刻却在读取网络数据。工作队列对象不在乎到底做些什么，它们
     * 只知道取出命令对象，然后调用其 execute() 方法。类似的，它们只要是实现
     * 命令模式的对象，就可以放入队列中，当线程可用时，就调用此对象的 execute()
     * 方法。
     *
     *
     * 命令模式的更多用途之二：日志请求
     *
     * 某些应用需要将所有的动作都记录在日志中，并能在系统死机后，重新调用这些
     * 动作恢复到之前的状态。通过新增两个方法（store()、load()），命令模式
     * 就能够支持这一点。在 Java 中，可以利用对象的序列化（Serialization）
     * 实现这些方法，但是一般认为序列化最好还是只用在对象的持久化上（persis-
     * tence）。
     *
     * 要怎么做呢？当执行命令时，将历史记录储存在磁盘中（store()）。一旦系统
     * 死机，就可以将命令对象重新加载（load()），并成批地依次调用这些对象的
     * execute() 方法。
     *
     * 这种日志的方式对于遥控器来说没有意义，然而，有许多调用大型数据结构的动
     * 作的应用无法在每次改变发生时被快速地存储。通过使用记录日志，可以将上次
     * 检查点（checkpoint）之后的所有操作记录下来，如果系统出状况，从检查点
     * 开始应用这些操作。比方说，对于电子表格应用，可能想要实现的的错误恢复方
     * 式是将电子表格的操作记录在日志中，而不是每次电子表格一有变化就记录整个
     * 电子表格。对更高级的应用而言，这些技巧可以被扩展应用到事务（transac-
     * tion）处理中，也就是说，一整群操作必须全部进行完成，或者没有进行任何
     * 的操作。
     */
    public static void main(String[] args) {

        /*
         * 创建并加载遥控器
         */
        RemoteControl remoteControl = RemoteLoader.createRemoteControl();

        /*
         * 打印遥控器
         */
        System.out.println(remoteControl);

        /*
         * 使用遥控器
         *
         * 宏命令的执行与撤销
         */
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }

}