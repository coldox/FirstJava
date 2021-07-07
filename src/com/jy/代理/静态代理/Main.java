package com.jy.代理.静态代理;

public class Main {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        Proxy proxy = new Proxy(landlord);
        proxy.rent();
    }
}
