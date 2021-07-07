package com.jy.代理.动态代理;

public class Landlord implements Rent {

    @Override
    public void rent() {
        System.out.println("开租了");
    }
}
