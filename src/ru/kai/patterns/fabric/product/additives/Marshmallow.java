package ru.kai.patterns.fabric.product.additives;

import ru.kai.patterns.fabric.product.drink.Drink;

public class Marshmallow extends Additives{
    public Marshmallow(Drink drink) {
        super(drink);
        name = "Marshmallow";
        price = 30f;
    }
}
