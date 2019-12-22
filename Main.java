package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        try {
            arr[0][0] = "2";
            arr[0][0] = "2";
            arr[0][1] = "A";
            arr[0][2] = "78";
            arr[0][3] = "*";
            arr[1][0] = "$";
            arr[2][0] = "2";
            arr[3][0] = "5";
            arr[1][1] = "4";
            arr[1][2] = "7";
            arr[1][3] = "5";
            arr[2][1] = "0";
            arr[2][2] = "9";
            arr[2][3] = "8";
            arr[3][1] = "567";
            arr[3][2] = "2";
            arr[3][3] = "7";
            arr[4][0] = "8";
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("размер массива не верный");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.print(" Сумма чисел: " + arrayInit(arr));

        System.out.println();
    }

    public static int arrayInit(String[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();

                    System.out.println("В массиве есть символ отличный от числа");
                }
            }
        }
        return sum;
    }
}

