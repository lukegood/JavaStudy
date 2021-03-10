package com.all.often;
import java.math.BigInteger;

public class UseBigInteger {
    public static void main(String[] args){
        BigInteger bigA = new BigInteger("99999999999999999999999999999");
        BigInteger bigB = new BigInteger("8888888888888888888888888888888888888888888888");
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.subtract(bigB));
        System.out.println(bigA.multiply(bigB));
        System.out.println(bigA.divide(bigB));
        BigInteger[] result = bigA.divideAndRemainder(bigB);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
