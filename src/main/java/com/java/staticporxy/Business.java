package com.java.staticporxy;


import com.java.proxy.Font;
import com.java.proxy.FontProvider;

public class Business {

    public static void main(String[] args) {
        FontProvider fontProvider = ProviderFactory.getFontProvider();
        Font font = fontProvider.getFont("微软雅黑");
        System.out.println(font);
        fontProvider.printName("代理模式实现AOP");
    }

}