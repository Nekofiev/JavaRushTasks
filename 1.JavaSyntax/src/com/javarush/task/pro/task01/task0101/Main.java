package com.javarush.task.pro.task01.task0101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String string = scanner.nextLine();
        //System.out.println(string);
        int sum = 0;

        while (scanner.hasNextInt()){
          int number = scanner.nextInt();
          sum = sum + number;

        }
        System.out.println(sum);
    }
}
