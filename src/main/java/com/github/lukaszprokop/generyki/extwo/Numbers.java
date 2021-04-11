package com.github.lukaszprokop.generyki.extwo;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        new ArrayNumbers(new ArrayPrinter()).strNumbers();
        new ArrayNumbers(new ArrayPrinter()).intNumbers();
        System.out.println("------------------------------");
        new ListNumbers(new ListPrinter()).strNumbers();
        new ListNumbers(new ListPrinter()).intNumbers();
    }
}

class ArrayNumbers {
    private final ArrayPrinter arrayPrinter;

    public ArrayNumbers(ArrayPrinter arrayPrinter) {
        this.arrayPrinter = arrayPrinter;
    }

    void strNumbers() {
        String[] arrayOne = new String[]{"One", "Two", "Three", "Four", "Five"};
        String[] arrayTwo = new String[]{"One", "Two", "Three", "Four", "Five"};
        arrayPrinter.print(arrayOne, arrayTwo);
    }

    void intNumbers() {
        Integer[] arrayOne = new Integer[]{1, 2, 3, 4, 5};
        Integer[] arrayTwo = new Integer[]{1, 2, 3, 4, 5};
        arrayPrinter.print(arrayOne, arrayTwo);
    }
}

class ListNumbers {
    private final ListPrinter listPrinter;

    public ListNumbers(ListPrinter listPrinter) {
        this.listPrinter = listPrinter;
    }

    void strNumbers() {
        List<String> listOne = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));
        List<String> listTwo = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));
        listPrinter.print(listOne, listTwo);
    }

    void intNumbers() {
        List<Integer> listOne = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> listTwo = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        listPrinter.print(listOne, listTwo);
    }
}
