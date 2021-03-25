package com.all.exercise;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args){
        int[] data = new int[10];
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            data[i] = rand.nextInt(10) + 1;
        }
        for(int num : data){
            System.out.print(num + " ");
        }
        System.out.println();
        quickSort(data, 0, data.length - 1);
        for(int num : data){
            System.out.print(num + " ");
        }

    }

    public static void quickSort(int[] data, int start, int end){
        if(start == end){
            return ;
        }
        int index = new RandomPartition().randomPartition(data, start, end);
        if(index > start){
            quickSort(data, start, index - 1);
        }
        if(index < end){
            quickSort(data, index + 1, end);
        }
    }
}
