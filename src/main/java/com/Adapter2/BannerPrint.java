package com.Adapter2;

/**
 * Adapter(适配)
 * Adapter模式的主角。使用Adaptee角色的方法来满足Target角色的需求。
 */
public class BannerPrint extends Print {
    private Banner banner;

    public BannerPrint(String str) {
        this.banner = new Banner(str);
    }

    @Override
    String showWithParen() {
        System.out.println("showWithParen方法执行前");
        return  banner.showWithParen()+ "对Adaptee的showWithParen方法进行扩充";
    }

    @Override
    String showWithAster() {
        System.out.println("showWithAster方法执行前");
        return banner.showWithAster()  + "对Adaptee的showWithAster方法进行扩充";
    }


}
