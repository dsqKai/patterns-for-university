package ru.kai.patterns.fabric.product.drink;

import ru.kai.patterns.fabric.fabric.ingredientFactory.DrinkIngredientFactory;
import ru.kai.patterns.fabric.fabric.VolumeFactory;
import ru.kai.patterns.fabric.product.base.Base;
import ru.kai.patterns.fabric.product.mainIngredient.MainIngredient;
import ru.kai.patterns.fabric.product.topping.Topping;

public abstract class Drink {
    protected Base basis;
    protected MainIngredient mainIngredient;
    protected Topping topping;

    protected String name;
    protected Float volume;

    protected double price;

    protected DrinkIngredientFactory ingredientFactory;


    public void setName(String name) {
        this.name = name;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(VolumeFactory volumeFactory) {
        this.volume = volumeFactory.createVolume();
    }

    public double getPrice() {
        return Math.floor(price*(volume+0.2f));
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription(){
        return "Description for " + name + "\nParameters: " + volume;
    }
}
