package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SquaredList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua List: ");
        int n = sc.nextInt();

        //nhap cac phan tu
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " : ");
            int number = sc.nextInt();
            list.add(number);
           }
        System.out.println("List duoc tao la: " + list);

        //tao list moi la binh phuong cua cac phan tu
        ArrayList<Integer> squaredList = new ArrayList<>();
        for (int num : list) {
            squaredList.add(num*num);
        }
        System.out.println("List binh phuong : " + squaredList);

        //kiem tra co bao nhieu phan tu > 50
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 50) {
                count ++;
            }
        }
        System.out.println("Co " + count + " lon hon 50");
    }
}
