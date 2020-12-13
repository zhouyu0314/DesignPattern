package com.factory.idcard;

import com.factory.framework.Factory;
import com.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体创建者
 * 负责生成具体产品
 */
public class IdCardFactory extends Factory {
    private List owners = new ArrayList();


    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
