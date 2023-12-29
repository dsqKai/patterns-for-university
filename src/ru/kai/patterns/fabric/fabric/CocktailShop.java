package ru.kai.patterns.fabric.fabric;

import ru.kai.patterns.fabric.fabric.ingredientFactory.CocktailIngredientFactory;
import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;
import ru.kai.patterns.fabric.product.drink.CoctailNoAlco;
import ru.kai.patterns.fabric.product.drink.Drink;

public class CocktailShop extends DrinkShop{

    @Override
    public Drink createDrink(String type) {
        DrinkIngredientFactory ingredientFactory = new CocktailIngredientFactory();
        Drink drink = null;
        if (type.equals("cocktailNoAlco")){

            drink = new CoctailNoAlco(ingredientFactory);
            drink.setName("cocktailNoAlco");

        }
        return drink;
    }
}
