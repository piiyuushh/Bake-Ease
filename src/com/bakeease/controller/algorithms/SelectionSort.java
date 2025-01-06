package com.bakeease.controller.algorithms;

import com.bakeease.model.adminModel;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author piyushkarn
 */
public class SelectionSort {
    // list for price sorting
    List<adminModel> PriceSortedList;

    public SelectionSort() {
        // initializing array list for price
        PriceSortedList = new ArrayList<>();

    }

    /*
    price sorting starts.
    @param array list PriceSortedList
    validates empty sort
    */
    public List<adminModel> sortByPrice(List<adminModel> productList, boolean isDesc) {
        this.PriceSortedList.clear();
        this.PriceSortedList.addAll(productList);
        if (PriceSortedList == null || PriceSortedList.isEmpty()) {
            throw new IllegalArgumentException("Product list is empty. Insert data!!");
        }

        for (int i = 0; i < PriceSortedList.size() - 1; i++) {
            int priceIndex = findpriceIndex(PriceSortedList, i, isDesc);
            if (i != priceIndex) {
                swap(PriceSortedList, i, priceIndex);
            }
        }

        return PriceSortedList;
    }
    
    /*
    method to find price index
    @param PriceSortedList is used to get price
    */
    private int findpriceIndex(List<adminModel> priceSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < priceSortList.size(); j++) {
            if (shouldSwap(PriceSortedList.get(j).getPrice(), PriceSortedList.get(extremumIndex).getPrice(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    // checks is values are to be swapped or not
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }
    // swaps sorted price value
    private void swap(List<adminModel> priceSortList, int i, int j) {
        adminModel temp = PriceSortedList.get(i);
        PriceSortedList.set(i, PriceSortedList.get(j));
        PriceSortedList.set(j, temp);
    }
    
}
