package com.homework;

public class OneDimentionalArray {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    public int[] createArray(int n) {
        array = new int[n];
        return array;
    }

    // Task 4a
    public void oddArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((2 * i + 1));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = ((2 * i + 1));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    //Task 4b
    public void twentyArray() {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 11));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length - 1; i++) {
            if(!(array[i] % 2 == 0)) {
                odd++;
            }
        }
        System.out.println("Odd elements: " + odd);
        System.out.println("Even elements: " + (array.length - odd));
    }

    //task 4c
    public  void tenArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (1 + (int) (Math.random() * 100));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length ; i++) {
            if (!(i % 2 == 0)) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }

    //task 4d
    public  void fifteenArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (-50 + (int) (Math.random() * 101));
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        int max = 0;
        int min = 0;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if(array[i] < min) {
                min = array[i];
                indexMin = i;
            }

        }
        System.out.println("Minimal: " + min + "\t" + "indexMin: " + indexMin);
        System.out.println("Maximal: " + max + "\t" + "indexMax: " + indexMax);


    }

    //task 4e
    public void doubleTenArray(int n){
        int [] array1 = createArray(n);
        int [] array2 = createArray(n);

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 11));
            System.out.print(array1[i] + " ");
            }
        System.out.print("\n");
        int sum1 = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            sum1 += array1[i];
            }
        System.out.println("Среднее арифметическое array1: " + sum1 / array1.length);

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 11));
            System.out.print(array1[i] + " ");
        }
        System.out.print("\n");
        int sum2 = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            sum2 += array1[i];
        }
        System.out.println("Среднее арифметическое array2: " + sum2 / array1.length);
        if(sum1/array1.length > sum2/array2.length) System.out.println("Среднее арифметическое больше для array1!");
        else if(sum1/array1.length < sum2/array2.length) System.out.println("Среднее арифметическое больше для array2!");
        else System.out.println("Значения средних арифметических равны!");
    }

    //Task 4f
    public void mostFrequentElement(int n) {
        int[] array1 = new int[n];
        int value1 = 0;
        int value0 = 0;
        int value1BelowZero = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (-1 + (int)(Math.random() * 3));
            System.out.print(array1[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 1)
            value1++;
            else if (array1[i] == 0)
                value0++;
            else if (array1[i] == -1)
                value1BelowZero++;

        }
        System.out.println("Value1: " + value1 + "\nValue0: " + value0 + "\nValue1BelowZero: " + value1BelowZero);
        if (value1 > value0 && value1 > value1BelowZero) System.out.println(1);
        else if (value0 > value1 && value0 > value1BelowZero) System.out.println(0);
        else if (value1BelowZero > value1 && value1BelowZero > value0) System.out.println(-1);
        else if (value1 > value1BelowZero && value1 == value0) System.out.println(1 + " " + 0);
        else if (value1 > value0 && value1 == value1BelowZero) System.out.println(1 + " " + -1);
        else if (value0 > value1  && value0 == value1BelowZero) System.out.println(0 + " " + -1);
        else  System.out.println(1 + " " + -1 + " " + 0);
    }
}
