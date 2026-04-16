package org.example;

import java.util.Scanner;

public class MessageEncoder {
    public static void main(String[] args) {
        String a = "abcdefghijkmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can ma hoa: ");
        String message = sc.nextLine().toLowerCase(); //chuyen tat ca sang chu thuong

        StringBuilder encodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            //tim vi tri cua ky tu c trong bang ma a
            int index = a.indexOf(c);
            if (index != -1) {
                // neu tim thay la chu cai. Lay ki tu tuong ung o bang b
                encodedMessage.append(b.charAt(index));
            } else {
                encodedMessage.append(c);
            }
        }
        System.out.println("Ma da duoc ma hoa: " + encodedMessage.toString());
    }
}
