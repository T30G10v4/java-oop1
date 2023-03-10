package org.lessons.java.bank;

import java.util.Random;

public class Account {
    private int code;
    private String name;
    private double amount;

    public Account() {

        Random rnd = new Random();
        code = rnd.nextInt(1001);
        amount = 0.00;

    }

    public Account(String name, double amount) {

        Random rnd = new Random();
        code = rnd.nextInt(1001);
        this.name = name;
        this.amount = amount;

    }
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAmount() {
        return amount;
    }
    public void deposit (double amount) {

        this.amount+=amount;

    }

    public boolean withdraw (double amount) {


        if(this.amount-amount>=0){

            this.amount-=amount;
            return true;

        }
        else return false;

    }

    public String toString(){

        return code+"-"+name+"-"+amount;

    }

}
