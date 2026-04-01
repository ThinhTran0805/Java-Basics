package org.example;

import java.util.Scanner;

public class SmallestPositiveInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNhonhat = 0;
        int n = 0;

        while (soNhonhat < 1000){
            n++;
            soNhonhat += n;
        }
        soNhonhat -= n;
        n--;
        System.out.println("So n nho nhat de tong (1...n) be hon 1000 la: " + n);
        System.out.println("So nguyen duong nho nhat be hon 1000 la : " + soNhonhat);
    }
}
