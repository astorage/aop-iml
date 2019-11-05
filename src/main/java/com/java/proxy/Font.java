package com.java.proxy;

import lombok.Data;

@Data
public class Font {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
