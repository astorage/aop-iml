package com.java.staticporxy;

import com.java.function.FontProvider;

/**
 */
public class ProviderFactory {

    public static FontProvider getFontProvider() {
        return new CachedFontProvider();
    }



}