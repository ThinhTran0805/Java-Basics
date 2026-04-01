package org.example;
import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int tongLe = 0;
        boolean laSoDauTien = true; // Biến này để kiểm soát dấu "+"

        for (int i = 1; i <= n; i += 2) {
            if (n == 7 && i == 3) {
                continue;
            }
            tongLe += i;
            // Nếu không phải số đầu tiên thì in dấu " + " trước
            if (!laSoDauTien) {
                System.out.print(" + ");
            }
            System.out.print(i);
            laSoDauTien = false; // Sau khi in số đầu tiên thì các số sau không còn là đầu tiên nữa
        }

        System.out.println("\nTong le la: " + tongLe);
    }
}