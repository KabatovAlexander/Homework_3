package com.homework;

public enum CoffeeEnum {
    ESPRESSO(0, "espresso"), AMERICANO(1, "americano"), CAPPUCINO(2, "cappucino"), LATTE(3, "latte"), RAF(4, "raf");
    private int variant;
    private String name;

    CoffeeEnum(int variant, String name) {
        this.variant = variant;
        this.name = name;
    }

    public int getVariant() {
        return variant;
    }

    public String getName() {
        return name;
    }
}


