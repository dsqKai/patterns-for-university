package ru.kai.patterns.decorator;
public class Milk extends Topping{
    public Milk(Product drink){
        super(drink);
        price = 50;
        description = "молоко";
    }
}
