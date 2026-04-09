package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a can tinh: ");
        double a = sc.nextDouble();
        System.out.println("nhap so b can tinh: ");
        double b = sc.nextDouble();
        System.out.println("nhap phep tinh can thuc hien: ");
        char c = sc.next().charAt(0);
        double result = Calculator.Calculator(a, b, c);
        System.out.println("ket qua cua phep tinh la: " + result);
    }

    public static double Calculator(double a, double b, char c) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) throw new ArithmeticException("khong chia duoc cho 0!");
                yield  a / b;
            }
            default -> throw new IllegalArgumentException("phep tinh khong hop le!" + c);
        };
    }
}
