package ru.kai.patterns.fabric.fabric;

import ru.kai.patterns.fabric.fabric.ingredientFactory.CoffeeIngredientFactory;
import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;
import ru.kai.patterns.fabric.product.drink.Coffee;
import ru.kai.patterns.fabric.product.drink.Drink;

public class CoffeeShop extends DrinkShop{

    @Override
    public Drink createDrink(String type) {
        DrinkIngredientFactory ingredientFactory = new CoffeeIngredientFactory();
        Drink drink = null;
        if (type.equals("coffee")){

            drink = new Coffee(ingredientFactory);
            drink.setName("Coffee");

        }
        return drink;
    }
}
