package ru.kai.patterns.lab8.menu;

import ru.kai.patterns.lab8.item.MenuComponent;
import ru.kai.patterns.lab8.iterator.MenuIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayMenu extends MenuComponent {
    private ArrayList<MenuComponent> menuComponents;
    private String name;
    public ArrayMenu(String name){
        this.name = name;
        menuComponents = new ArrayList<>();
    }
    public ArrayMenu(String name, ArrayList<MenuComponent> listMenu){
        this.name = name;
        menuComponents = listMenu;
    }
    public void out(){
        System.out.print(" " + getName());
        System.out.println("\n---------------------");

        for (MenuComponent menuComponent: menuComponents){
            menuComponent.out();
        }
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
    public ArrayList<MenuComponent> getAllChild() {
        return menuComponents;
    }

    public Iterator<MenuComponent> iterator() {
        return new MenuIterator(this);
    }
}
