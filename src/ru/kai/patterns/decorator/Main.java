package ru.kai.patterns.decorator;
public class Main {
    public static void main(String[] args) {
        Product espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Syrup(espresso);
        System.out.println(espresso.getPrice() + "\n" + espresso.getDescription());
    }
}