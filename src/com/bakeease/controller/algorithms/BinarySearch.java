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
    public adminModel searchByProductName(String searchValue, List<adminModel> studentList,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(studentList.get(mid).getProductName()) == 0) {
            return studentList.get(mid);
        } else if (searchValue.compareToIgnoreCase(studentList.get(mid).getProductName()) < 0) {
            return searchByProductName(searchValue, studentList, left, mid - 1);
        } else {
            return searchByProductName(searchValue, studentList, mid + 1, right);
        }

    }
}
