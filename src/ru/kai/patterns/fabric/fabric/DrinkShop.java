package ru.kai.patterns.fabric.fabric;

import ru.kai.patterns.fabric.product.drink.Drink;

public abstract class DrinkShop {

    public abstract Drink createDrink(String type);

    public static void order(Drink drink){
        System.out.println("Drink: " + drink.getDescription());
        System.out.println("Price: " + drink.getPrice());

    }



}
