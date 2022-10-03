package com.company;

import java.util.*;

public class Bouquet {


    private static List<Bouquet> bouquets = new ArrayList<>();

    private List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public static Bouquet assembleBouquet() {
        Bouquet bouquet = new Bouquet();

        for(int i = 0; i < 5; i++) {
            Flower flower = new Flower();
            bouquet.addFlowerToBouquet(flower);
        }

        bouquets.add(bouquet);

        System.out.println("New bouquet created");
        System.out.println(bouquet);
        System.out.println();

        return bouquet;
    }

    public void addFlowerToBouquet(Flower flower) {
        flowers.add(flower);
    }

    public static void sort() {
        for(Bouquet b: bouquets) {
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println(b);
            Collections.sort(b.flowers);
            System.out.println(b);
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
        }
    }

    public void findByLength(int length) {
        List<Flower> result = new ArrayList<>();

        for(Flower f: flowers) {
            if(length == f.getLength()) {
                result.add(f);
            }
        }

        System.out.println(result.isEmpty() ? "В букете нет цветка с заданным количеством стеблей(" : result);
    }

    public void findByName(String name1){
        List<Flower> results = new ArrayList<>();
        for (Flower n:flowers){
            if (name1.equals(n.getName())){
                results.add(n);
            }
        }
        System.out.println(results.isEmpty() ? "В букете нет такого цветка(" : results);
    }

    @Override
    public String toString() {
        return "Bouquet{" +"\n"+
                "flowers=" +"\n"+ flowers +
                '}';
    }
}


