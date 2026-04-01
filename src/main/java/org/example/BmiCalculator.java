package org.example;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap can nang: ");
        double canNang = sc.nextDouble();
        System.out.println("nhap chieu cao: ");
        double chieuCao = sc.nextDouble();
        double bmi = canNang / Math.pow(chieuCao, 2);

        //check condition
        if (bmi < 15) {
            System.out.println("Bạn gầy.");
        }
        else if (bmi < 18.5) {
            System.out.println("Bạn hơi gầy.");
        } else if (bmi < 25) {
            System.out.println("Bạn bình thường.");
        } else if (bmi < 30) {
            System.out.println("Bạn tiền béo phì (hơi mập).");
        } else if (bmi < 35) {
            System.out.println("Bạn béo phì độ 1 (mập).");
        } else {
            System.out.println("Bạn béo phì độ 2 (quá mập).");
        }
    }
}
