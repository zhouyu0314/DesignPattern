package com.adapter1;

/**
 * Client(负责使用Target角色所定义的方法进行具体处理)
 */
public class Main {
    public static void main(String[] args) {



        Print print = new BannerPrint("hello");
        String paren = print.showWithParen();
        System.out.println(paren);//(hello)
        String aster = print.showWithAster();
        System.out.println(aster);//*hello*



    }
}
