package org.example;

import java.util.Scanner;

public class SearchFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button;
        boolean rightNumber = false;

        do {
            System.out.println("MENU TIM KIEM");
            System.out.println("Nhap phim can dung:");
            button = sc.nextInt();

            switch (button){
                case 1, 2, 3, 4 -> {
                    String msg = switch (button){
                        case 1 -> "ten";
                        case 2 -> "tac gia";
                        case 3 -> "nha san suat";
                        default -> "tieu de";
                    };
                    System.out.println("Tim theo " + msg + ".");
                    rightNumber = true;
                }
                default -> System.out.println("Phim da nhap khong dung. Vui long chon lai:");
            }
            System.out.println();
        } while (!rightNumber);
        sc.close();
    }
}
