package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product orange = new Product();
        orange.setName("Orange");
        orange.setDescription("Very Good Orange");
        orange.setPrice(1.0);
        System.out.println(orange.toString());
        System.out.println(orange.padLeftCode());

    }
}
