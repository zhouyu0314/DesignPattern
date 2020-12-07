package com.Adapter1;

/**
 * Adaptee(被适配)
 * 持有既定方法的角色
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public String showWithParen(){
        return "(" + str + ")";
    }

    public String showWithAster(){
        return "*" + str + "*";
    }


}
