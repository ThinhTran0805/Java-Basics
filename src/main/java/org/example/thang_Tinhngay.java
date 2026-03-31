package org.example;

import java.util.Scanner;

public class thang_Tinhngay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot thang trong nam");
        int thang = sc.nextInt();
        //check condition
        if (thang <= 0 || thang > 12) {
            System.out.println("Thang duoc nhap khong hop le.");
        } else if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            System.out.println("Thang " + thang + " co 31 ngay.");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang " + thang + " co 30 ngay.");
        } else if (thang == 2) {
            System.out.println("Xin nhap them nam:");
            int nam = sc.nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println("Thang co 29 ngay.");
            } else {
                System.out.println("Thang co 28 ngay.");
            }
        }
    }
}
