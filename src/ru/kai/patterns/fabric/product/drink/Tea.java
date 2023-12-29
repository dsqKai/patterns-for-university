package ru.kai.patterns.fabric.product.drink;


import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;

public class Tea extends Drink{
    public Tea(DrinkIngredientFactory ingredientFactory){
        price = 200f;
        basis = ingredientFactory.createBasis();
        mainIngredient = ingredientFactory.createMainIngredient();
    }
}
