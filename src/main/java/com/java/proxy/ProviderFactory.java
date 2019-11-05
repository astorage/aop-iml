package com.java.proxy;

public abstract class ProviderFactory {


    public static FontProvider getFontProvider() {
        return new FontProviderFromDisk();
    }
}