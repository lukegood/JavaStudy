package com.all.solution;

public class OfferFourtyFive {
    public int findNthDigit(int n) {
        if(n < 0){
            return -1;
        }
        int digits = 1;
        while(true){
            int numbers = findCount(digits) * digits;
            if(n < numbers){
                return findNum(n, digits);
            }
            else{
                n -= numbers;
                digits++;
            }
            //return -1;
        }
    }

    public int findCount(int digits){
        if(digits == 1){
            return 10;
        }
        return (int)Math.pow(10, digits - 1) * 9;
    }

    public int findNum(int n, int digits){
//        int remain = 0;
//        int num = beginNum(digits);
////        if(n < 10 && digits == 1){
////            remain = -1;
////        }
////        else if(n % digits != 0){
////            remain = digits - n % digits;
////        }
        int num = beginNum(digits) + n / digits;
        int remain = digits - n % digits;
        for(int i = 1; i < remain; i++){
            num /= 10;
        }
        System.out.println("num2:"+num);
        return num % 10;
    }

    public int beginNum(int digits){
        if(digits == 1){
            return 0;
        }
        else{
            return (int)Math.pow(10, digits - 1);
        }
    }
}
