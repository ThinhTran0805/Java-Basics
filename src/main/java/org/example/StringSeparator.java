package org.example;

import java.util.Scanner;

public class StringSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can tach: ");
        String str = sc.nextLine();

        //tach chuoi chu: xoa tat ca nhung gi khong phai la chu cai
        String letters = str.replaceAll("[^a-zA-Z]", "");
        //tach chuoio so: xoa tat ca nhung gi khong phai la so
        String numbers = str.replaceAll("[^0-9]", "");

        System.out.println("Chuoi ky tu da tach la: " + letters);
        System.out.println("Chuoi so da tach la: " + numbers);
    }
}
