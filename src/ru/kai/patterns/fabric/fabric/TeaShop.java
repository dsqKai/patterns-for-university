package ru.kai.patterns.fabric.fabric;

import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;
import ru.kai.patterns.fabric.fabric.ingredientFactory.TeaIngredientFactory;
import ru.kai.patterns.fabric.product.drink.Tea;
import ru.kai.patterns.fabric.product.drink.Drink;

public class TeaShop extends DrinkShop{

    @Override
    public Drink createDrink(String type) {
        DrinkIngredientFactory ingredientFactory = new TeaIngredientFactory();
        Drink drink = null;
        if (type.equals("tea")){

            drink = new Tea(ingredientFactory);
            drink.setName("tea");

        }
        return drink;
    }
}
