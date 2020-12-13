package com.adapter1;

/**
 * Adapter(适配)
 * Adapter模式的主角。使用Adaptee角色的方法来满足Target角色的需求。
 */
public class BannerPrint extends Banner implements Print {

    public BannerPrint(String str) {
        super(str);
    }

    @Override
    public String showWithParen() {
        System.out.println("showWithParen方法执行前");
        return super.showWithParen() + "对Adaptee的showWithParen方法进行扩充";
    }

    @Override
    public String showWithAster() {
        System.out.println("showWithAster方法执行前");
        return super.showWithAster() + "对Adaptee的showWithAster方法进行扩充";
    }
}
