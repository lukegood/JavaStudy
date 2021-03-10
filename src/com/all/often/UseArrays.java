package com.all.often;
import java.util.Arrays;
public class UseArrays {
    public static void main(String args[]){
        int[] data = new int[]{1,8,5,2,3,7,-1};
        int[] data2 = new int[]{-1,1,2,3,5,7,8};
        int[] data3 = new int[10];
        Arrays.fill(data3, 100);
        Arrays.sort(data);
        System.out.println(Arrays.binarySearch(data, 5));
        System.out.println(Arrays.equals(data, data2));
        for(int num : data3){
            System.out.println(num);
        }
    }
}
