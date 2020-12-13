package com.template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display = new StringDisplay("hello,world");

        display.display();
    }
}
