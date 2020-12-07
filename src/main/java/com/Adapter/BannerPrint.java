package com.Adapter;

public class BannerPrint extends Banner implements Print {

    public BannerPrint(String str) {
        super(str);
    }

    @Override
    public String showWithParen() {
        return super.showWithParen();
    }

    @Override
    public String showWithAster() {
        return super.showWithAster();
    }
}
