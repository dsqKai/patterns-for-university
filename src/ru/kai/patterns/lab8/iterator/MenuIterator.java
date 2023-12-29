package ru.kai.patterns.lab8.iterator;

import ru.kai.patterns.lab8.item.MenuComponent;

import java.util.Iterator;
import java.util.List;

public class MenuIterator implements Iterator<MenuComponent> {
    private final List<MenuComponent> menuComponents;

    private int position = 0;

    public MenuIterator(MenuComponent menuComponent) {
        this.menuComponents = menuComponent.getAllChild();
    }

    public boolean hasNext() {
        return position < menuComponents.size();
    }

    public MenuComponent next() {
        position++;
        return menuComponents.get(position-1);
    }

    public void remove() {
        if (position > 0) {
            position--;
            menuComponents.remove(position);
        }

    }
}
