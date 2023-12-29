package ru.kai.patterns.decorator;
public abstract class Topping extends Product {
    Product drink;

    public Topping(Product drink){
        this.drink = drink;
    }

    public void setDrink(Product drink){
        this.drink = drink;
    }
    public int getPrice(){
        return price + drink.getPrice();
    }

    public String getDescription(){
        return drink.getDescription() + " + " + description;
    }
}
