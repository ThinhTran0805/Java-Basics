package org.example;

public class TypeCasting {
    static void main(String[] args) {
        int a = 6, b = 12;
        double ketQua = (double) a/b; //int -> double
        System.out.println("ket qua a/b: " +ketQua);

        //ep kieu hep
        int c = 128;
        byte d = (byte) c;
        System.out.println("c: " +c);
        System.out.println("d: " +d); // kieu byte tu -128 den 127, nen khi ep kieu byte cho c bi that thoat du lieu -> sai

        int e = 15;
        byte f = (byte) e; // ep kieu tu int -> byte
        System.out.println("e: " +e);
        System.out.println("f: " +f);
        // Note: co the that thoat du lieu khi ep kieu hep
    }
}
