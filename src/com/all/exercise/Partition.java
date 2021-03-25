package com.all.exercise;

public class Partition {
    public int partition(int[] data, int start, int end){
        int pivot = data[end];
        int i = start;
        for(int j = start; j < end; j++){
            if(data[j] < pivot){
                if(i != j){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
                i++;
            }
        }
        data[end] = data[i];
        data[i] = pivot;
        return i;
    }
}
