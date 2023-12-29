package ru.kai.patterns.fabric.product.additives;
import ru.kai.patterns.fabric.product.drink.Drink;

public abstract class Additives extends Drink{
    Drink drink;
    public Additives(Drink drink){
        this.drink = drink;
    }

    public String getDescription(){
        return drink.getDescription() + " + " + name;
    }

    public double getPrice(){
        return drink.getPrice() + price;
    }

}
