package ru.kai.patterns.lab8;

import ru.kai.patterns.lab8.menu.ArrayMenu;
import ru.kai.patterns.lab8.menu.HashMapMenu;
import ru.kai.patterns.lab8.menu.VectorMenu;
import ru.kai.patterns.lab8.item.MenuComponent;
import ru.kai.patterns.lab8.item.MenuItem;
import ru.kai.patterns.lab8.iterator.MenuIterator;

public class Main {
    public static void main(String[] args) {
        MenuComponent coffeeMenu = new ArrayMenu("Меню кофе");
        MenuComponent pizzaMenu = new VectorMenu("Меню пицца");
        MenuComponent dessertMenu = new ArrayMenu("Меню десерты");
        MenuComponent dumplingMenu = new HashMapMenu("Меню пельмени");
        MenuComponent vineMenu = new ArrayMenu("Винная карта");

        coffeeMenu.add(new MenuItem("кофе", 1, true));
        coffeeMenu.add(new MenuItem("кофе c молоком", 1.5, false));

        pizzaMenu.add(new MenuItem("пицца с курицей", 5, false));
        pizzaMenu.add(new MenuItem("пепперони", 3.5, false));
        pizzaMenu.add(new MenuItem("пицца 4 сыра", 4, false));

        for(MenuComponent component: pizzaMenu)
            component.out();
        System.out.println();
        MenuIterator iterator = new MenuIterator(pizzaMenu);
        iterator.next();
        iterator.remove();
        while (iterator.hasNext())
            iterator.next().out();
        System.out.println();

        coffeeMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("печенье", 1.5, false));
        dessertMenu.add(new MenuItem("наполеон", 2.5, false));
        dessertMenu.add(new MenuItem("прага", 2.5, false));
        dessertMenu.add(new MenuItem("круассан", 1.5, false));

        dumplingMenu.add(new MenuItem("C курицей", 5, false));
        dumplingMenu.add(new MenuItem("Cо свининой", 5, false));
        dumplingMenu.add(new MenuItem("C говядиной", 5, false));

        dumplingMenu.add(vineMenu);
        vineMenu.add(new MenuItem("Красное вино", 6.5, true));
        vineMenu.add(new MenuItem("Белое вино", 6.5, true));
        vineMenu.add(new MenuItem("Шампанское", 5.5, true));

        MenuComponent mainMenu = new ArrayMenu("Основное меню");
        mainMenu.add(coffeeMenu);
        mainMenu.add(pizzaMenu);
        mainMenu.add(dumplingMenu);
        mainMenu.out();
    }
}