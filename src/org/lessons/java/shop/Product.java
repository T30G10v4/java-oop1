package org.lessons.java.shop;

import java.util.Random;

public class Product {

    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    private Random rnd = new Random();

    public Product()
    {

        code = rnd.nextInt(100000000);
        name = "";
        description = "";
        price = 0.0;
        iva = 22;

    }

    public Product(String name, String description, double price, int iva) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }

    public int getCode() {

        return code;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getIva() {
        return iva;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getPriceWithIva() {

        return price + (price/100*iva);

    }

    public String extendedName() {

        return code + "-" + name;

    }

    public String padLeftCode() {

        String padLeftCode = Integer.toString(code);

        for(int i = 0; i<8-padLeftCode.length();i++){

            padLeftCode.concat("0");

        }

        return padLeftCode;
    }

    public String toString() {
        return code+"-"+name+"-"+this.getPriceWithIva();
    }
}
