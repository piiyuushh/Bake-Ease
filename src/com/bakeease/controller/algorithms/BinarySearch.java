/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bakeease.controller.algorithms;

import com.bakeease.model.adminModel;
import java.util.List;

/**
 *
 * @author piyushkarn
 */
public class BinarySearch {

    /**
     * Searches for an adminModel object in a sorted list by its product name.
     *
     * @param searchValue the product name to search for
     * @param productList the sorted list of adminModel objects
     * @param left the left boundary index of the search range
     * @param right the right boundary index of the search range
     * @return the matching adminModel object if found, otherwise null
     */
    
    public adminModel searchByProductName(String searchValue, List<adminModel> studentList,
            int leftIndex, int rightIndex) {

        // if the search range is invalid, return null
        if (rightIndex < leftIndex) {
            return null;
        }

        // mid value of current search range
        int midIndex = (leftIndex + rightIndex) / 2;

        // Compare the search value with the product name at the middle index        
        if (searchValue.compareToIgnoreCase(studentList.get(midIndex).getProductName()) == 0) {
            // If the search value matches the product name, return the object
            return studentList.get(midIndex);
        } else if (searchValue.compareToIgnoreCase(studentList.get(midIndex).getProductName()) < 0) {
            // If the search value is less than the middle product name, search in the left sublist
            return searchByProductName(searchValue, studentList, leftIndex, midIndex - 1);
        } else {
            // If the search value is greater than the middle product name, search in the right sublist
            return searchByProductName(searchValue, studentList, midIndex + 1, rightIndex);
        }  
    }
}
