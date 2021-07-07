package com.jy.代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class RentInvokeHander implements InvocationHandler {
    Rent rent;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object result = method.invoke(rent,args);
        charge();
        return result;
    }

    public RentInvokeHander(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);

    }
    void seeHouse() {
        System.out.println("看房");
    }
    void charge() {
        System.out.println("付费");
    }
}
