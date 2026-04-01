package org.example;

import java.util.Scanner;

public class tongChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban muon: ");
        int a = sc.nextInt();
        int tongChan = 0;

        if (a % 2 == 0){
            for (int i = 0; i <= a; i+= 2){
                tongChan += i;
                System.out.print(i);
                if (i < a){
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + tongChan);
            System.out.println("Tong cac so chan tu 0 den " + a + " la: " + tongChan);
        } else {
            System.out.println("Khong tinh tong khi so vua nhap la so le!");
        }
    }
}
