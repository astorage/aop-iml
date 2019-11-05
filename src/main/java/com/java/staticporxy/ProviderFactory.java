package com.java.staticporxy;

import com.java.proxy.FontProvider;

/**
 */
public class ProviderFactory {

    public static FontProvider getFontProvider() {
        return new CachedFontProvider();
    }



}