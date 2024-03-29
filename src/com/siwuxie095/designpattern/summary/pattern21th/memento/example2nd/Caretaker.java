package com.siwuxie095.designpattern.summary.pattern21th.memento.example2nd;

/**
 * 管理者
 *
 * @author Jiajing Li
 * @date 2019-11-11 22:09:44
 */
class Caretaker {

    private Memento memento;

    Memento getMemento() {
        return memento;
    }

    void setMemento(Memento memento) {
        this.memento = memento;
    }
}
