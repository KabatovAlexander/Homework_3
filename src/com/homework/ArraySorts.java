package com.homework;


public class ArraySorts {

    private final int MIN = 2;
    private int n = MIN + (int) (Math.random() * 20);
    private int[] array = new int[n];


    public int[] getArray() {
        return array;
    }

    public int getN() {
        return n;
    }

    public int arrayFilling() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * n));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        return n;
    }


    public void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int var = 0;
                if (array[j] > array[j + 1]) {
                    var = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = var;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
        }
    }

    public  void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int arrMin = arr[i];
            int minI = i;
                for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < arrMin) {
                    arrMin = arr[j];
                    minI = j;
                }
            }
        if (i != minI) {
            int tmp = arr[i];
            arr[i] = arr[minI];
            arr[minI] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
