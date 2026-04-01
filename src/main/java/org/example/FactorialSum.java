package org.example;

public class FactorialSum {
    public static void main(String[] args) {
        long tongGiaithua = 0;
        long giaiThua = 1;

        for (int i = 1; i <= 10; i++){
            giaiThua *= i;
            tongGiaithua += giaiThua;
            System.out.println(i + "! = " + giaiThua);
        }
        System.out.println("Tong giai thua cua cac so tu 1 den 10 la: " + tongGiaithua);
    }
}
