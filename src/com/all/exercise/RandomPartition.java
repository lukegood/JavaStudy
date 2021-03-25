package com.all.exercise;

import java.util.Random;

public class RandomPartition {
    public int randomPartition(int[] data, int start, int end){
        int rand = randomPivot(start, end);
        int pivot = data[rand];
        data[rand] = data[end];
        data[end] = pivot;
        int i = start;
        for(int j = start; j < end; j++){
            if(data[j] < pivot){
                if(i != j){
                    int temp2 = data[i];
                    data[i] = data[j];
                    data[j] = temp2;
                }
                i++;
            }
        }
        data[end] = data[i];
        data[i] = pivot;
        return i;
    }

    public int randomPivot(int start, int end){
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }
}
