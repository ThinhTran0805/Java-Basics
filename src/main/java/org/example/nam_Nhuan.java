package org.example;

import java.util.Date;
import java.util.Scanner;

public class nam_Nhuan {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap nam duong de kiem tra: ");
        int namDuong = sc.nextInt();
        if ((namDuong % 4 == 0 && namDuong % 100 != 0) || (namDuong % 400 ==0)){
            System.out.println("Nam " + namDuong + " la phai nam nhuan.");
        } else {
            System.out.println("Nam " + namDuong + " khong phai nam nhuan.");
        }
    }
}
