package org.example;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen can tinh tong: ");
        int n = sc.nextInt();
        int tong = 0;

        n = Math.abs(n);
        while (n > 0){
            tong = tong + n % 10;
            n /= 10;
        }
        System.out.println("Tong cua so nguyen vua nhap la: " + tong);
    }
}
