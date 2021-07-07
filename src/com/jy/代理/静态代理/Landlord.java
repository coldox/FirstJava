package com.jy.代理.静态代理;

import java.awt.image.renderable.RenderableImageProducer;

public class Landlord implements Rent {

    @Override
    public void rent() {
        System.out.println("开租了");
    }
}
