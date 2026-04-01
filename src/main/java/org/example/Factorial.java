package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so can tinh luy thua: ");
        int n = sc.nextInt();
        long giaiThua = 1;

        for (int i = 1; i <= n; i++){
            giaiThua *= i;
        }
        System.out.println("Luy thua cua " + n + "! la: " + giaiThua);
    }
}
