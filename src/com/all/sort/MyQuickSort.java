package com.all.sort;

public class MyQuickSort {
    public static void main(String[] args){
        int[] data = new int[]{1, 7, 9, 2, 4, 6};
        quickSort(data, 0, data.length - 1);
        for(int num : data){
            System.out.println(num);
        }
    }

    public static int partition(int[] data, int start, int end){
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

    public static void quickSort(int[] data, int start, int end){
        if(start == end){
            return ;
        }
        int index = partition(data, start, end);
        if(index > start){
            quickSort(data, start, index - 1);
        }
        if(index < end){
            quickSort(data, index + 1, end);
        }
    }
}
