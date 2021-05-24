package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
   private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] number, int numberToSearch){

        int[] sortednumber= sortAlgorithm.sort(number);
        System.out.println(sortAlgorithm);
        //sort the array
        //search the array
        //return the result
        return 3;
    }
}
