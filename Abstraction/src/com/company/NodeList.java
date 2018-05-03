package com.company;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem Item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
