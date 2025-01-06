package com.bakeease.controller.algorithms;

import com.bakeease.model.adminModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piyushkarn
 */
public class MergeSort {
    /**
     * Sorts a list of adminModel objects by product name.
     *
     * @param product the list of adminModel objects to be sorted
     * @param isDesc  Boolean indicating whether to sort in descending order (true) 
     *                or ascending order (false)
     * @return the sorted list of adminModel objects
     * @throws IllegalArgumentException if the provided list is null or empty
     */

    public List<adminModel> sortByName(List<adminModel> product, boolean isDesc) {
        if (product == null || product.isEmpty()) {
            throw new IllegalArgumentException("Product list is empty. Fix it!");
        }

        return mergeSort(product, isDesc);
    }

    /**
     * Recursively divides and sorts the list of adminModel objects using Merge Sort.
     *
     * @param product the list of adminModel items to be sorted
     * @param isDesc  Boolean indicating the sort order
     * @return the sorted list of adminModel objects
     */
    private List<adminModel> mergeSort(List<adminModel> product, boolean isDesc) {
        if (product.size() <= 1) {
            return product;
        }

        int mid = product.size() / 2;
        List<adminModel> left = new ArrayList<>(product.subList(0, mid));
        List<adminModel> right = new ArrayList<>(product.subList(mid, product.size()));

        // Recursively split and merge
        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }

    /**
     * Merges two sorted sub lists into a single sorted list.
     *
     * @param left   the left sub list
     * @param right  the right sub list
     * @param isDesc Boolean indicating the sort order
     * @return the mergedList and sorted list
     */
    private List<adminModel> merge(List<adminModel> left, List<adminModel> right, boolean isDesc) {
        List<adminModel> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        // Merge based on the model names
        while (i < left.size() && j < right.size()) {
            if (shouldPlaceLeft(left.get(i).getProductName(), right.get(j).getProductName(), isDesc)) {
                mergedList.add(left.get(i));
                i++;
            } else {
                mergedList.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            mergedList.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            mergedList.add(right.get(j));
            j++;
        }

        return mergedList;
    }

    /**
     * Determines whether the left product name should come before the right product name.
     *
     * @param leftModel  the product name from the left sub list
     * @param rightModel the product name from the right sub list
     * @param isDesc     Boolean indicating the sort order
     * @return true if the left product name should come first, false otherwise
     */
    private boolean shouldPlaceLeft(String leftModel, String rightModel, boolean isDesc) {
        int comparison = leftModel.compareToIgnoreCase(rightModel);
        return isDesc ? comparison > 0 : comparison < 0;
    }
}
