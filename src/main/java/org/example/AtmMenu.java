package org.example;

import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button;
        int tiepTuc;
        do {
            System.out.println("----- MENU ATM -----");
            System.out.println("1. Kiem tra so du.");
            System.out.println("2. Rut tien.");
            System.out.println("3. Thoat.");
            System.out.print("Moi ban chon thao tac: ");
            button = sc.nextInt();

            switch (button) {
                case 1 -> System.out.println("=> So du cua ban la: 5.000.000 VND");
                case 2 -> System.out.println("=> So tien rut cua ban la: 500.000 VND");
                case 3 -> System.out.println("Cam on ban. Hen gap lai!");
                default -> {
                    System.out.println("Thao tac khong hop le!");
                    System.out.println();
                    continue;
                }
            }

            if (button == 1 || button == 2) {
                do {
                    System.out.println("---------------------------------------");
                    System.out.println("Ban co muon tiep tuc giao dich khong?");
                    System.out.println("1. Co (Quay lai Menu)");
                    System.out.println("0. Khong (Thoat MENU)");
                    System.out.print("Lua chon cua ban: ");
                    tiepTuc = sc.nextInt();

                    if (tiepTuc != 1 && tiepTuc != 0){
                        System.out.println("Thao tac khong dung. Vui long nhap lai!");
                    }
                } while (tiepTuc != 1 && tiepTuc != 0);

                if (tiepTuc == 0) {
                    button = 3;
                    System.out.println("Cam on ban. Hen gap lai!");
                }
            }
            System.out.println();
        } while (button != 3);
        sc.close();
    }
}
