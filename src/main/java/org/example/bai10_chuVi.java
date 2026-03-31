package org.example;

import java.util.Scanner;

public class bai10_chuVi {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron :" );
        double r = sc.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi hinh tron la: " + cv);
        System.out.println("Dien tich hinh tron la: " + dt);
    }
}
