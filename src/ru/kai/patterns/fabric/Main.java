package ru.kai.patterns.fabric;

import ru.kai.patterns.fabric.fabric.CoffeeShop;
import ru.kai.patterns.fabric.fabric.DrinkShop;
import ru.kai.patterns.fabric.fabric.SmallVolumeFactory;
import ru.kai.patterns.fabric.product.additives.Marshmallow;
import ru.kai.patterns.fabric.product.drink.Drink;

public class Main {
    public static void main(String[] args) {
        DrinkShop drinkShop = new CoffeeShop();
        Drink drink = drinkShop.createDrink("coffee");
        drink.setVolume(new SmallVolumeFactory());
        drink = new Marshmallow(drink);
        DrinkShop.order(drink);
    }

}