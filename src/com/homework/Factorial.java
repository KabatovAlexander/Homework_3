package com.homework;

public class Factorial {

    private long n = (int) (Math.random() * 20);

    public long getN() {
        return n;
    }

    public long factorialRecursion(long n) {
        long startTime = System.nanoTime();
        if(n > 1) {
            n = n * factorialRecursion(n - 1);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("TIme for recursion: " + estimatedTime + " nanoseconds");
        return n;
    }

    public long factorialCycle(long n) {
        long startTime = System.nanoTime();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.nanoTime();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("TIme for cycle: " + estimatedTime + " nanoseconds");
    return fact;
    }



}
