package org.example;

import java.util.Scanner;

public class bai10_1hcm {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        double cd = sc.nextDouble();
        double cr = sc.nextDouble();
        double chuVi = (cd + cr) * 2;
        double dienTich = cd * cr;
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
    }
}
