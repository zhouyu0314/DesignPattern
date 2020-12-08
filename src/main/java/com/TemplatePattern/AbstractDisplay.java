package com.TemplatePattern;

/**
 * AbstractClass
 * 负责声明在模板方法中和负责实现模板方法
 */
public abstract class AbstractDisplay {
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    abstract void open();

    abstract void print();

    abstract void close();


}
