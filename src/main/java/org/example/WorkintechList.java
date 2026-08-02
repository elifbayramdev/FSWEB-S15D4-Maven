package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<? super T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }

        boolean result = super.add(element);
        sort();

        return result;
    }

    @Override
    public void add(int index, T element) {
        if (!contains(element)) {
            super.add(index, element);
            sort();
        }
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object object) {
        boolean result = super.remove(object);
        sort();
        return result;
    }
}