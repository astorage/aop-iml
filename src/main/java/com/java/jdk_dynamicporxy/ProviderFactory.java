package com.java.jdk_dynamicporxy;


import java.lang.reflect.Proxy;

import com.java.function.FontProvider;
import com.java.function.FontProviderFromDisk;

public class ProviderFactory {

    public static FontProvider getFontProvider() {
        Class<FontProvider> targetClass = FontProvider.class;
        return (FontProvider)Proxy.newProxyInstance(targetClass.getClassLoader(), new Class[]{targetClass},
                new CachedProviderHandler(new FontProviderFromDisk()));

    }
}