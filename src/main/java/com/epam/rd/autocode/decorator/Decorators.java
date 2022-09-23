package com.epam.rd.autocode.decorator;

import java.util.*;

public class Decorators extends ArrayList<String> {

    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        return new AbstractList<>() {

            private final List<String> list = sourceList;

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
                        return get(cursor++);
                    }
                };
            }
        };
    }
}
