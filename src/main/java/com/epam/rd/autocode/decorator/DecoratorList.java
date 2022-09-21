package com.epam.rd.autocode.decorator;

import java.util.*;

public class DecoratorList extends AbstractList<String> {

    private final List<String> list;

    public DecoratorList(List<String> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return (list.size() + 1) / 2;
    }

    @Override
    public String get(int index) {
        return list.get(index * 2);
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            int cursor = 0;
            @Override
            public boolean hasNext() {
                return cursor < size();
            }

            @Override
            public String next() {
                String result = get(cursor);
                cursor = cursor + 1;
                return result;
            }
        };
    }
}
