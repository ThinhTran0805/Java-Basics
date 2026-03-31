package org.example;

import java.util.Scanner;

public class diemThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diemThi;

        do {
            System.out.println("Nhap vao diem thi cua ban: ");
            diemThi = sc.nextInt();
            if (diemThi > 10 || diemThi < 0) {
                System.out.println("Diem thi khong hop le. Vui long nhap lai!");
            }
            System.out.println();
        } while (diemThi > 10 || diemThi < 0);
        System.out.println("Diem thi cua ban la: " + diemThi + ". Hop le!");
        sc.close();
    }
}
