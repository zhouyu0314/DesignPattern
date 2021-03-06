package com.factory;

import com.factory.framework.Factory;
import com.factory.framework.Product;
import com.factory.idcard.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");

        card1.user();
        card2.user();
        card3.user();
        IdCardFactory idCardFactory = (IdCardFactory) factory;
        System.out.println(idCardFactory.getOwners());
        System.out.println("测试");
    }
}
