package com.codegym;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] newArr;
        newArr = joinArr(arr1, arr2);
        System.out.println("---Mảng sau khi ghép---");
        for (int element : newArr) {
            System.out.print(element+"\t");
        }
    }

    //Phương thức nối 2 mảng
    public static int[] joinArr(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] newArr = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < size; i++) {
            newArr[i] = arr2[i - arr1.length];
        }
        return newArr;
    }
}
