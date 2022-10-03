package com.company;

public enum FlowerName {

    ROSA("Роза"),
    GIPSOFIL("Гипсофилы"),
    TULPAN("Тюльпан"),
    ROMASHKA("Ромашка"),
    PIONY("Пионы");

    private final String name;

    FlowerName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(FlowerName.values()[0].name());
    }

}
