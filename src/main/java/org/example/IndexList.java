package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IndexList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n cac phan tu cua List: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        //in ra co bao nhieu so nho hon 80;
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            int num = rd.nextInt(250);
            list.add(num);
        }
        System.out.println("List ngau nhien la: " + list);
        int count = 0;
        String pos = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 80) {
                count++;
                pos += i + " ";
            }
        }
        System.out.println("Co " + count + " phan tu be hon 80");
        System.out.println("Vi tri cua cac phan tu < 80 la: " + pos);
    }
}
