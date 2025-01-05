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

    List<adminModel> productSortedList;

    
    public SelectionSort(){
        productSortedList = new ArrayList<>();
        
    }
    
    
    public List<adminModel> sortByPrice(List<adminModel> studentList, boolean isDesc) {
        this.productSortedList.clear();
        this.productSortedList.addAll(studentList);
        if (productSortedList == null || productSortedList.isEmpty()) {
            throw new IllegalArgumentException("Product list is empty. Insert data!!");
        }

        for (int i = 0; i < productSortedList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(productSortedList, i, isDesc);
            if (i != extremumIndex) {
                swap(productSortedList, i, extremumIndex);
            }
        }

        return productSortedList;
    }
    
    
    private int findExtremumIndex(List<adminModel> studentSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < studentSortList.size(); j++) {
            if (shouldSwap(productSortedList.get(j).getPrice(), productSortedList.get(extremumIndex).getPrice(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }
    
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }
    
    
    private void swap(List<adminModel> studentSortList, int i, int j) {
        adminModel temp = productSortedList.get(i);
        productSortedList.set(i, productSortedList.get(j));
        productSortedList.set(j, temp);
    }
    

}
