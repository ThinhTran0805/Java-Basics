package org.example;

import java.util.Scanner;

public class thang_Tinhquy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao thang can kiem tra: ");
        int thang = sc.nextInt();
        //check condition
        switch (thang) {
            case 1, 2, 3 -> System.out.println("Tháng thuộc quý một.");
            case 4, 5, 6 -> System.out.println("Tháng thuộc quý hai.");
            case 7, 8, 9 -> System.out.println("Tháng thuộc quý ba.");
            case 10, 11, 12 -> System.out.println("Tháng thuộc quý tư.");
            default -> System.out.println("Tháng không hợp lệ!");
        }
    }
}
