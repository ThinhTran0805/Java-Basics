package org.example;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can kiem tra doi xung: ");
        String str = sc.nextLine();

        //dua chuoi ve ky tu thuong
        String lowerStr = str.toLowerCase();
        String revertedString = new StringBuilder(lowerStr).reverse().toString();
        if (revertedString.equals(str)) {
            System.out.println("Chuoi " + str + " vua nhap la chuoi doi xung!");
        } else {
            System.out.println("Chuoi " + str + " vua nhap khong phai la chuoi doi xung!");
        }
    }
}
