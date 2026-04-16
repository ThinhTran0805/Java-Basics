package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringNumberExtractor {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int Sum = 0;
        int Quantity = 0;

        //dung regex de tim cac so (\d+)
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str1);

        System.out.println("Cac so duoc tim thay la: ");
        while (matcher.find()) {
            //lay so ra roi chuyen sang kieu int
            int value = Integer.parseInt(matcher.group());
            System.out.println(value + " ");
            Sum += value;
            Quantity++;
        }

//        //cach 2: dung split
//        String[] parts = str1.split("\\s+");
//        for (String p : parts) {
//            try {
//                int value = Integer.parseInt(p);
//                Sum += value;
//                Quantity++;
//            } catch (Exception e) {
//            }
//        }
        double Average = (Quantity > 0) ? (double) Sum / Quantity : 0;
        System.out.println("Tong cac so trong chuoi: " + Sum);
        System.out.println("Trung binh cong la: " + Average);
    }
}
