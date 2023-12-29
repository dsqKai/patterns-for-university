package ru.kai.patterns.fabric.product.additives;

import ru.kai.patterns.fabric.product.drink.Drink;

public class Cinnamon extends Additives{

    public Cinnamon(Drink drink) {
        super(drink);
        name = "Cinnamon";
        price = 15f;
    }
}
