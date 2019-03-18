package com.homework;
//6a
public class IfSwitchStructure{

    public  void switchCaseFunction() {
        CoffeeEnum coffeeEnum = CoffeeEnum.RAF;
        long startTime = System.nanoTime();

        switch (coffeeEnum) {
            case ESPRESSO:
                System.out.println(coffeeEnum.getName());
                break;
            case AMERICANO:
                System.out.println(coffeeEnum.getName());
                break;
            case CAPPUCINO:
                System.out.println(coffeeEnum.getName());
                break;
            case LATTE:
                System.out.println(coffeeEnum.getName());
                break;
            case RAF:
                System.out.println(coffeeEnum.getName());
                break;
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("TIme for switch-case construction : " + estimatedTime + " nS");
    }

    public void elseIfFunction() {
        CoffeeEnum coffeeEnum = CoffeeEnum.RAF;
        long startTime = System.nanoTime();

        if (coffeeEnum == CoffeeEnum.ESPRESSO) {
            System.out.println(coffeeEnum.getName());
        } else if (coffeeEnum == CoffeeEnum.AMERICANO) {
            System.out.println(coffeeEnum.getName());
        } else if (coffeeEnum == CoffeeEnum.CAPPUCINO) {
            System.out.println(coffeeEnum.getName());
        } else if (coffeeEnum == CoffeeEnum.LATTE) {
            System.out.println(coffeeEnum.getName());
        } else if (coffeeEnum == CoffeeEnum.RAF)
            System.out.println(coffeeEnum.getName());

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("TIme for if-else construction : "+estimatedTime +" nS");
    }

}
