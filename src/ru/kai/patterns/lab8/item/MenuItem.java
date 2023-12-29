package ru.kai.patterns.lab8.item;

public class MenuItem extends MenuComponent{
    private final String name;

    private final double price;

    private boolean vegetarian;

    public MenuItem(String name, double price, boolean vegetarian){
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public boolean isVegetarian() {
        return false;
    }

    @Override
    public void out() {
        System.out.println("-- " + getName() + ",Price: " + getPrice() + " $");
    }
}
