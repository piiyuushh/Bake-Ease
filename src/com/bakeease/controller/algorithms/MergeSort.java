package com.bakeease.controller.algorithms;

import com.bakeease.model.adminModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piyushkarn
 */
public class MergeSort {

    public List<adminModel> sortByName(List<adminModel> product, boolean isDesc) {
        if (product == null || product.isEmpty()) {
            throw new IllegalArgumentException("Product list is empty. Fix it!");
        }

        return mergeSort(product, isDesc);
    }

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

    private List<adminModel> merge(List<adminModel> left, List<adminModel> right, boolean isDesc) {
        List<adminModel> merged = new ArrayList<>();
        int i = 0, j = 0;
        // Merge based on the model names
        while (i < left.size() && j < right.size()) {
            if (shouldPlaceLeft(left.get(i).getProductName(), right.get(j).getProductName(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    private boolean shouldPlaceLeft(String leftModel, String rightModel, boolean isDesc) {
        int comparison = leftModel.compareToIgnoreCase(rightModel);
        return isDesc ? comparison > 0 : comparison < 0;
    }
}
