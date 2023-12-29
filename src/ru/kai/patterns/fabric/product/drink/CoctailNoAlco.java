package ru.kai.patterns.fabric.product.drink;


import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;

public class CoctailNoAlco extends Drink{
    public CoctailNoAlco(DrinkIngredientFactory ingredientFactory){
        price = 200f;
        basis = ingredientFactory.createBasis();
        mainIngredient = ingredientFactory.createMainIngredient();
        topping = ingredientFactory.createTopping();
    }
}
