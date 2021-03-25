package com.all.sort;

public class QuickSort {
    private int partition(int[] input, int l, int r){
        int pivot = input[r];
        int i = l;
        for (int j = l; j < r; j++){
            if(input[j] < pivot){
                int tmp = input[i];
                input[i] = input[j];
                input[j] = tmp;
                i++;
            }
        }
        input[r] = input[i];
        input[i] = pivot;
        return i;
    }
}
