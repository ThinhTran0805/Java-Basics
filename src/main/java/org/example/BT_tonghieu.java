package org.example;

import java.util.Scanner;

public class BT_tonghieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tong hai so x va y: ");
        double tong = sc.nextDouble();
        System.out.println("nhap hieu hai so x va y: ");
        double hieu = sc.nextDouble();
        double x = (tong + hieu) / 2;
        double y = (tong - hieu) / 2;
        System.out.println("gia tri cua x: " + x + " va y: " + y);
    }
}