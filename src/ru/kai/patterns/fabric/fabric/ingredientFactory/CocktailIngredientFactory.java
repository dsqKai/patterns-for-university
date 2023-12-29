package ru.kai.patterns.fabric.fabric.ingredientFactory;

import ru.kai.patterns.fabric.product.base.Base;
import ru.kai.patterns.fabric.product.base.Juice;
import ru.kai.patterns.fabric.product.mainIngredient.Fruit;
import ru.kai.patterns.fabric.product.mainIngredient.MainIngredient;
import ru.kai.patterns.fabric.product.topping.Soda;
import ru.kai.patterns.fabric.product.topping.Topping;

public class CocktailIngredientFactory implements DrinkIngredientFactory{
    @Override
    public Base createBasis() {
        return new Juice();
    }

    @Override
    public MainIngredient createMainIngredient() {
        return new Fruit();
    }

    @Override
    public Topping createTopping() {
        return new Soda();
    }
}
