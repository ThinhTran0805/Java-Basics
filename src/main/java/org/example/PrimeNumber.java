package org.example;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String luaChon;

        do {
            System.out.print("Nhap vao so a: ");
            int a = sc.nextInt();
            // Kiểm tra số nguyên tố
            boolean laSoNguyenTo = true;
            if (a < 2) {
                laSoNguyenTo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(a); i++) {
                    if (a % i == 0) {
                        laSoNguyenTo = false;
                        break;
                    }
                }
            }
            // In kết quả
            if (laSoNguyenTo) {
                System.out.println("So " + a + " la so nguyen to.");
            } else {
                System.out.println("So " + a + " khong phai la so nguyen to.");
            }

            // Hỏi người dùng có tiếp tục không
            System.out.print("Ban co muon tiep tuc khong? (c/k): ");
            luaChon = sc.next();
        } while (luaChon.equalsIgnoreCase("c"));
        System.out.println("Cam on ban da su dung chuong trinh!");
    }
}
