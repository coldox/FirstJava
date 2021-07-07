package com.jy.代理.静态代理;

public class Proxy implements Rent {
    Landlord landlord;

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    @Override
    public void rent() {
        seeHouse();
        landlord.rent();
        charge();
    }
    void seeHouse() {
        System.out.println("看房");
    }
    void charge() {
        System.out.println("付费");
    }
}
