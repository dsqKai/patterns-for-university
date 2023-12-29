package ru.kai.patterns.fabric.fabric.ingredientFactory;


import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;
import ru.kai.patterns.fabric.product.base.Base;
import ru.kai.patterns.fabric.product.base.Water;
import ru.kai.patterns.fabric.product.mainIngredient.MainIngredient;
import ru.kai.patterns.fabric.product.mainIngredient.Tea;
import ru.kai.patterns.fabric.product.topping.Topping;

public class TeaIngredientFactory implements DrinkIngredientFactory {
    @Override
    public Base createBasis() {
        return new Water();
    }

    @Override
    public MainIngredient createMainIngredient() {
        return new Tea();
    }

    @Override
    public Topping createTopping() {
        return null;
    }
}
