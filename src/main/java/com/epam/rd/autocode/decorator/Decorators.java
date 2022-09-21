package com.epam.rd.autocode.decorator;

import java.util.*;

public class Decorators extends ArrayList<String> {

    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        return new DecoratorList(sourceList);
    }
}
