package ru.kai.patterns.decorator;
public abstract class Product {
    protected int price;
    protected String description;
    public int getPrice(){
        return price;
    }

    public String getDescription(){

        return description;
    }
}
