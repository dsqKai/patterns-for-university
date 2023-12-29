package ru.kai.patterns.lab8.menu;

import ru.kai.patterns.lab8.item.MenuComponent;
import ru.kai.patterns.lab8.iterator.MenuIterator;

import java.util.*;

public class HashMapMenu extends MenuComponent{
    private final LinkedHashMap<MenuComponent, String> menuComponents;
    private final String name;
    public HashMapMenu(String name){
        this.name = name;
        menuComponents = new LinkedHashMap<>();
    }
    public void out(){
        System.out.print(" " + getName());
        System.out.println("\n---------------------");

        for (MenuComponent menuComponent: menuComponents.keySet()){
            menuComponent.out();
        }
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.put(menuComponent, menuComponent.getName());
    }
    @Override
    public String getName() {
        return name;
    }
    public List<MenuComponent> getAllChild() {
        return menuComponents.keySet().stream().toList();
    }

    public Iterator<MenuComponent> iterator() {
        return new MenuIterator(this);
    }
}
