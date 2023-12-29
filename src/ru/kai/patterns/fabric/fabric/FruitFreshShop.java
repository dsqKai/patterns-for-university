package ru.kai.patterns.fabric.fabric;

import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;
import ru.kai.patterns.fabric.fabric.ingredientFactory.FruitFreshIngredientFactory;
import ru.kai.patterns.fabric.product.drink.Drink;
import ru.kai.patterns.fabric.product.drink.FruitFresh;

public class FruitFreshShop extends DrinkShop{

    @Override
    public Drink createDrink(String type) {
        DrinkIngredientFactory ingredientFactory = new FruitFreshIngredientFactory();
        Drink drink = null;
        if (type.equals("fresh")){

            drink = new FruitFresh(ingredientFactory);
            drink.setName("FruitFresh");

        }
        return drink;
    }
}
