package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] M = new int[n];

        for (int i = 0; i < M.length; i++) {
            int randomNumber = rd.nextInt(101);
            M[i] = randomNumber;
        }
        System.out.println("Mang ngau nhien la: " + Arrays.toString(M));

        //dao nguoc mang va xuat mang
        for (int i = 0, j = M.length - 1; i < j; i++, j--) {
            int temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
        System.out.println("Mang dao nguoc la: " + Arrays.toString(M));

        //sap xep mang tang dan
        Arrays.sort(M);
        System.out.println("Mang tang dan la: " + Arrays.toString(M));

        //tong cac phan tu trong mang
        int tong = 0;
        for (int parts : M) {
            tong += parts;
        }
        System.out.println("Tong cua mang la: " + tong);

        //nhap so bat ky. Kiem tra co ton tai trong mang khong vaf xuat ra index
        System.out.println("Nhap so can kiem tra: ");
        int number = sc.nextInt();
        boolean check = false;
        String position = "";
        for (int i = 0; i < M.length; i++) {
            if (M[i] == number) {
                check = true;
                position = i + " ";
            }
        }
        if (check) {
            System.out.println("So vua nhap co ton tai va o vi tri: " + position);
        } else {
            System.out.println("So vua nhap khong ton tai trong mang!");
        }
    }
}
