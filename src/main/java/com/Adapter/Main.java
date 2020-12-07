package com.Adapter;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("hello");
        String paren = banner.showWithParen();
        System.out.println(paren);//(hello)
        String aster = banner.showWithAster();
        System.out.println(aster);//*hello*


        /*
        但是目前想对此结果进行处理
         */
        Print print = new BannerPrint("hello");
        String s1 = print.showWithParen();
        String s = print.showWithAster();


    }
}
