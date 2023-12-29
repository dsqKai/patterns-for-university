package ru.kai.patterns.fabric.fabric.ingredientFactory;

import ru.kai.patterns.fabric.product.base.Base;
import ru.kai.patterns.fabric.product.mainIngredient.MainIngredient;
import ru.kai.patterns.fabric.product.topping.Topping;

public interface DrinkIngredientFactory {
    Base createBasis();
    MainIngredient createMainIngredient();

    Topping createTopping();
}
