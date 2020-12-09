package com.factoryPattern.idcard;

import com.factoryPattern.framework.Product;

/**
 * 具体加工方
 * 决定了具体的产品
 */
public class IdCard extends Product {
    private String owner;
    private String cardNo;

    IdCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void user() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }

}
