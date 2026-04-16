package org.example;

public class CheckWord {
    public static void main(String[] args) {
        String a = "toi cham hoc toi chiu kho toi dep trai!";
        int count = 0;
        String[] parts = a.split("\\s+");
        for (String p : parts) {
            //loai bo dau cau o dau/cuoi neu co
            String word = p.replaceAll("[^a-zA-Z]", "");
            if (word.equalsIgnoreCase("toi")) {
                count++;
            }
        }
        System.out.println("So tu toi dem duoc trong chuoi la: " + count);
    }
}
