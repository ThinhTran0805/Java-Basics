package org.example;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra: ");
        String str = sc.nextLine();

        int isLowerCase = 0, isUpperCase = 0, isDigit = 0, isWhitespace = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)) {
                isLowerCase++;
            }
            if (Character.isUpperCase(c)) {
                isUpperCase++;
            }
            if (Character.isDigit(c)) {
                isDigit++;
            }
            else if (Character.isWhitespace(c)) {
                isWhitespace++;
            }
        }
        System.out.println("Ky tu thuong: " + isLowerCase);
        System.out.println("Ky tu hoa: " + isUpperCase);
        System.out.println("ky tu so: " + isDigit);
        System.out.println("Khoang trang: " + isWhitespace);
    }
}