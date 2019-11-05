package com.java.jdk_dynamicporxy;


import java.lang.reflect.Proxy;

import com.java.proxy.FontProvider;
import com.java.proxy.FontProviderFromDisk;

public class ProviderFactory {

    public static FontProvider getFontProvider() {
        Class<FontProvider> targetClass = FontProvider.class;
        return (FontProvider)Proxy.newProxyInstance(targetClass.getClassLoader(), new Class[]{targetClass},
                new CachedProviderHandler(new FontProviderFromDisk()));

    }
}