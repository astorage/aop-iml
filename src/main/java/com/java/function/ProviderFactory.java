package com.java.function;

public abstract class ProviderFactory {


    public static FontProvider getFontProvider() {
        return new FontProviderFromDisk();
    }
}