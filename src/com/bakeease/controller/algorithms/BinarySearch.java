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
            int left, int right) {

        // if the search range is invalid, return null
        if (right < left) {
            return null;
        }

        // mid value of current search range
        int mid = (left + right) / 2;

        // Compare the search value with the product name at the middle index        
        if (searchValue.compareToIgnoreCase(studentList.get(mid).getProductName()) == 0) {
            // If the search value matches the product name, return the object
            return studentList.get(mid);
        } else if (searchValue.compareToIgnoreCase(studentList.get(mid).getProductName()) < 0) {
            // If the search value is less than the middle product name, search in the left sublist
            return searchByProductName(searchValue, studentList, left, mid - 1);
        } else {
            // If the search value is greater than the middle product name, search in the right sublist
            return searchByProductName(searchValue, studentList, mid + 1, right);
        }  
    }
}
