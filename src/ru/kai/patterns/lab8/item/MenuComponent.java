package ru.kai.patterns.lab8.item;

import java.util.Iterator;
import java.util.List;

public abstract class MenuComponent implements Iterable<MenuComponent> {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void out() {
        throw new UnsupportedOperationException();
    }
    public List<MenuComponent> getAllChild() {
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> iterator() {
        throw new UnsupportedOperationException();
    }
}
