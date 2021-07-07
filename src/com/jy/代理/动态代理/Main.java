package com.jy.代理.动态代理;

public class Main {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        RentInvokeHander rentInvokeHander = new RentInvokeHander(landlord);
        Rent rent = (Rent) rentInvokeHander.getProxy();
        rent.rent();
    }
}
