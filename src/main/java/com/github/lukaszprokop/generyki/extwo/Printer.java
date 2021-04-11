package com.github.lukaszprokop.generyki.extwo;

import java.util.List;
import java.util.stream.IntStream;

class ListPrinter {
    // TODO: napraw tą klasę tak aby po wszystkim nie było ostrzeżenia o surowym użyciu listy (Raw use)
    void print(List<String> listOne, List<String> listTwo){
        IntStream.range(0, listOne.size())
                .forEach(v -> System.out.printf(listOne.get(v) + " = " + listTwo.get(v) + "%n"));
    }

    void print(List<Integer> listOne, List<Integer> listTwo){
        IntStream.range(0, listOne.size())
                .forEach(v -> System.out.printf(listOne.get(v) + " = " + listTwo.get(v) + "%n"));
    }
}

class ArrayPrinter {
    void print(String[] arrayOne, String[] arrayTwo){
        IntStream.range(0, arrayOne.length)
                .forEach(v -> System.out.printf(arrayOne[v] + " = " + arrayTwo[v] + "%n"));
    }

    void print(Integer[] arrayOne, Integer[] arrayTwo){
        IntStream.range(0, arrayOne.length)
                .forEach(v -> System.out.printf(arrayOne[v] + " = " + arrayTwo[v] + "%n"));
    }
}
