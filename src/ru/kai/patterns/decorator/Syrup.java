package ru.kai.patterns.decorator;
public class Syrup extends Topping{
    public Syrup(Product drink){
        super(drink);
        price = 50;
        description = "сироп";
    }
}
