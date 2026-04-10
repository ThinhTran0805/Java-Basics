package org.example;
import java.util.Scanner;

public class quadraticSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        double a = sc.nextDouble();
        System.out.print("nhap b: ");
        double b = sc.nextDouble();
        System.out.print("nhap c: ");
        double c = sc.nextDouble();
        solve(a, b, c);
    }

    public static void solve(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("PT co vo so nghiem.");
                else System.out.println("PT vo nghiem.");
            } else {
                System.out.println("PT bac 1 co nghiem x = " + (-c / b));
            }
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("PT bac 2 vo nghiem.");
            } else if (delta == 0) {
                System.out.println("PT bac 2 co nghiem kep x = " + (-b / (2 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("PT bac 2 co 2 nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}