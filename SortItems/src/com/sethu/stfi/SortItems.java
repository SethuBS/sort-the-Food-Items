package com.sethu.stfi;

import java.util.Arrays;
import java.util.Comparator;

public class SortItems {

    public static String[] sortItems(String items[], boolean inReverse) {
        // Define a comparator based on natural order or reverse order
        Comparator<String> comparator = inReverse ? Comparator.reverseOrder() : Comparator.naturalOrder();

        // Sort the items array using the defined comparator
        Arrays.sort(items, comparator);

        return items;
    }

    // Utility method to print items array
    private static void printItems(String[] items) {
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] items = {"fig", "apple", "date", "banana", "egg", "carrot"};

        // Sort items in ascending order
        String[] ascendingOrder = sortItems(items, false);
        System.out.println("Ascending Order:");
        printItems(ascendingOrder);

        // Sort items in descending order
        String[] descendingOrder = sortItems(items, true);
        System.out.println("\nDescending Order:");
        printItems(descendingOrder);
    }
}