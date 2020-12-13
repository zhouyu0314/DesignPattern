package com.template;

/**
 * 负责实现AbstractClass中的抽象方法
 */
public class StringDisplay extends AbstractDisplay {
    private String str;
    private int length;
    public StringDisplay(String str) {
        this.str = str;
        this.length = str.getBytes().length;
    }

    @Override
    void open() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    void close() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
