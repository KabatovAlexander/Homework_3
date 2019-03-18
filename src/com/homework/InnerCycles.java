package com.homework;

public class InnerCycles {
    private int size = 7;

    public void rect() {
        for (int row = 1; row <= size; row++) {
            for (int colunm = 1; colunm <= size; colunm++) {
                System.out.print("# ");
            }
            System.out.println("\n");
        }
    }

    public void figureA() {
        for (int row = 1; row <= size; row++) {
            for (int colunm = 1; colunm <= size; colunm++) {
                if(colunm <= row) {
                    System.out.print("# ");
                }
            }
            System.out.println("\n");
        }
    }

    public void figureB() {
        for (int row = 1; row <= size; row++) {
            for (int colunm = 1; colunm <= size; colunm++) {
                if(colunm >= row) {
                    System.out.print("# ");
                }
            }
            System.out.println("\n");
        }
    }

    public void figureC() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(i > j ) {
                    System.out.print("  ");
                }
                else System.out.print("# ");

            }
        System.out.println("\n");
        }
    }

    public void figureD() {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if(j > i ) {
                    System.out.print("  ");
                }
                else System.out.print("# ");

            }
            System.out.println("\n");
        }
    }

    public void figureE() {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if(j == 1 || j == size || i == 1 || i == size) {
                    System.out.print("# ");
                }
                else System.out.print("  ");

            }
            System.out.println("\n");
        }
    }

    public void figureF() {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if(j == size + 1 - i || i == 1 || i == size) {
                    System.out.print("# ");
                }
                else System.out.print("  ");

            }
            System.out.println("\n");
        }
    }

    public void figureG() {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if(j == i || i == 1 || i == size) {
                    System.out.print("# ");
                }
                else System.out.print("  ");

            }
            System.out.println("\n");
        }
    }
    public void figureH() {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if(j == size + 1 - i || j == i || i == 1 || i == size) {
                    System.out.print("# ");
                }
                else System.out.print("  ");

            }
            System.out.println("\n");
        }
    }
    public void figureI() {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if(j == size + 1 - i || j == i || i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("# ");
                }
                else System.out.print("  ");

            }
            System.out.println("\n");
        }
    }

}


