package com.bakeease.controller.algorithms;

import com.bakeease.model.adminModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piyushkarn
 */
public class InsertionSort {
    // list for quantity sorting
    List<adminModel> QuantitySortedList;

    public InsertionSort() {
        // initializing array list for quantity
        QuantitySortedList = new ArrayList<>();
    }

    /*
    quantity sorting starts.
    @param array list QuantitySortedList
    validates empty sort
    */
    public List<adminModel> sortByQuantity(List<adminModel> productList, boolean isDesc) {
        this.QuantitySortedList.clear();
        this.QuantitySortedList.addAll(productList);
        if (QuantitySortedList == null || QuantitySortedList.isEmpty()) {
            throw new IllegalArgumentException("Product list is empty. Insert data!!");
        }

        for (int i = 1; i < QuantitySortedList.size(); i++) {
            adminModel key = QuantitySortedList.get(i);
            int j = i - 1;
            
            // Move elements of QuantitySortedList[0..i-1] that are greater (or smaller depending on isDesc) than key
            while (j >= 0 && shouldSwap(QuantitySortedList.get(j).getQuantity(), key.getQuantity(), isDesc)) {
                QuantitySortedList.set(j + 1, QuantitySortedList.get(j));
                j = j - 1;
            }
            QuantitySortedList.set(j + 1, key);
        }

        return QuantitySortedList;
    }

    // checks if values are to be swapped or not based on isDesc flag
    private boolean shouldSwap(int current, int key, boolean isDesc) {
        return isDesc ? current < key : current > key;
    }
}