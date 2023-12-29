package ru.kai.patterns.lab8.menu;

import ru.kai.patterns.lab8.item.MenuComponent;
import ru.kai.patterns.lab8.iterator.MenuIterator;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorMenu extends MenuComponent {
    private final Vector<MenuComponent> menuComponents;
    private final String name;
    public VectorMenu(String name){
        this.name = name;
        menuComponents = new Vector<>();
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
    public List<MenuComponent> getAllChild() {
        return menuComponents;
    }

    public Iterator<MenuComponent> iterator() {
        return new MenuIterator(this);
    }
}
