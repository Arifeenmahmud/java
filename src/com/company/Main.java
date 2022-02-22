package com.company;

public class Main {

    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i < i2; i++) {
            result += i;
        }
        System.out.println("test");
        return result;
    }

    public static void sum1(int i1, int i2) {
        int result = 0;
        for (int i = i1; i < i2; i++) {
            result += i;
        }
        System.out.println("" + result);
//        return result;
    }

    public static void main(String[] args) {
	// write your code here
        int result = sum(1, 10);
        System.out.println("" + result);
        sum1(1, 10);
    }
}
