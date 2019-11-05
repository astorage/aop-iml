package com.java.function;

public class FontProviderFromDisk implements FontProvider {


    public Font getFont(String name) {
        Font font = new Font();
        font.setName(name);
        return font;
    }

    public void printName(String name) {
        System.out.println(name);

    }

}