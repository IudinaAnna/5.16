package com.company;
import java.util.Scanner;
public class Main {
    static void count_stars(int count) {
        char s ='*';
        for(int i=0;i<count;i++) {
            System.out.print(s);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int n1;
        n1 = input.nextInt();
        System.out.print("Введите число 2: ");
        int n2;
        n2 = input.nextInt();
        System.out.print("Введите число 3: ");
        int n3;
        n3 = input.nextInt();
        System.out.print("Введите число 4: ");
        int n4;
        n4 = input.nextInt();
        System.out.print("Введите число 5: ");
        int n5;
        n5 = input.nextInt();
        count_stars(n1);
        count_stars(n2);
        count_stars(n3);
        count_stars(n4);
        count_stars(n5);
    }
}



