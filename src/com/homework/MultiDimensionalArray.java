package com.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiDimensionalArray extends ArraySorts{
    private int[][] array;
    private int a = 0;
    private int b = 0;

    public MultiDimensionalArray(int[][] array) {
        this.array = array;
    }
    public MultiDimensionalArray(int a, int b){
        array = new int[a][b];
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "MultiDimensionalArray{" + "array=" + Arrays.toString(array) + '}';
    }

    public void taskA() {
        int mainSum = 0;
        int subSum = 0;
        int condition1 = 0;
        int condition2 = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (1+ (int) (Math.random() * 99));
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == j)
                mainSum += array[i][j];
            }
        }
        System.out.println("Сумма главной диагонали: " + mainSum);
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j > 0; j--) {
                if (i ==  condition1 && j == condition2) {
                    subSum += array[i][j - 1];
                    condition1++;
                    condition2--;
                }
            }
        }
        System.out.println("Сумма побочной диагонали: " + subSum);
    }

        public void taskB() {
            int max = 0;
            ArrayList iMax = new ArrayList();
            ArrayList jMax = new ArrayList();
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    array[i][j] = (-99+ (int) (Math.random() * 199));
                    System.out.print(array[i][j] + " ");
                }
                System.out.print("\n");
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (array[i][j] > max || array[i][j] == max) {
                        max = array[i][j];
                        iMax.add(i);
                        jMax.add(j);
                    }
                }
            }
            System.out.println("Максимальный элемент: " + max + " ---> [i]" + "[j]" + "[" + iMax +"],[" + jMax + "]");

    }

    public  void taskC() {
        long sum;
        ArrayList sum1 = new ArrayList();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = (-10+ (int) (Math.random() * 11));
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < a; i++) {
            sum = 1;
            for (int j = 0; j < b; j++) {
                sum *= Math.abs(array[i][j]);
            }
            sum1.add(sum);
        }
        System.out.println("Максимальная суммма строки: " + Collections.max(sum1));

        System.out.println("Индекс строки с максимальной суммой: " + sum1.indexOf(Collections.max(sum1)));

    }

    public void taskD() {
        Integer[][] array = new Integer [a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = ((int) (Math.random() * 101));
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < a; i++) {
            Arrays.sort(array[i], Collections.reverseOrder());
        }
        System.out.println("Sorted array in desc order :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}


