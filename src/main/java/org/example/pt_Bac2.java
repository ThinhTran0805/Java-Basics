package org.example;

import java.util.Scanner;

public class pt_Bac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = sc.nextDouble();
        System.out.println("nhap b: ");
        double b = sc.nextDouble();
        System.out.println("nhap c: ");
        double c = sc.nextDouble();
        //check condition
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = 0;
        double x2 = 0;
        if (delta < 0) {
            System.out.println("Phuong trinh bac hai vo nghiem.");
        } else if (delta == 0) {
            x1 = - (b/(2*a));
            x2 = x1;
            System.out.println("Phuong trinh bac hai co hai nghiem x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phuong trinh co hai nghiem la x1 = " + x1);
            System.out.println("Phuong trinh co hai nghiem la x2 = " + x2);
        }
    }
}
