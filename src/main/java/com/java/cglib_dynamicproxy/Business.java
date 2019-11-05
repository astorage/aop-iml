package com.java.cglib_dynamicproxy;

import com.java.function.FontProviderFromDisk;

public class Business {

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        FontProviderFromDisk proxy = cgLibProxy.getProxy(FontProviderFromDisk.class);
        proxy.printName("微软雅黑");
    }

}
