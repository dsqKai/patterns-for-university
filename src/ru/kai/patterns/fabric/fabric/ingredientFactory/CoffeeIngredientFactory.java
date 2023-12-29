package ru.kai.patterns.fabric.fabric.ingredientFactory;

import ru.kai.patterns.fabric.product.base.Base;
import ru.kai.patterns.fabric.product.base.Water;
import ru.kai.patterns.fabric.product.mainIngredient.Coffee;
import ru.kai.patterns.fabric.product.mainIngredient.MainIngredient;
import ru.kai.patterns.fabric.product.topping.Syrup;
import ru.kai.patterns.fabric.product.topping.Topping;

public class CoffeeIngredientFactory implements DrinkIngredientFactory{
    @Override
    public Base createBasis() {
        return new Water();
    }

    @Override
    public MainIngredient createMainIngredient() {
        return new Coffee();
    }

    @Override
    public Topping createTopping() {
        return new Syrup();
    }
}
