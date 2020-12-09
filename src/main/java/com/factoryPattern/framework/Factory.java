package com.factoryPattern.framework;

/**
 * 创建者
 * 负责生成产品角色的抽象类
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = this.createProduct(owner);
        this.registerProduct(p);
        return p;
    }

      protected  abstract Product createProduct(String owner);

      protected  abstract void registerProduct(Product product);


    }