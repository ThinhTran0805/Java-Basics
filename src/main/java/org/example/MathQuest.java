package org.example;

public class MathQuest {
    public static void main(String[] args) {
        String[] quest = {"2+5+7 = ", "5*10 = ", "sqrt(16) = ", "12%2 = "};

        //tinh ket qua
        int sum = 2 + 5 + 7;
        System.out.println(quest[0] + sum);
        int multiply = 5 * 10;
        System.out.println(quest[1] + multiply);
        int squareRoot = (int) Math.sqrt(16);
        System.out.println(quest[2] + squareRoot);
        int modulo = 12 % 2;
        System.out.println(quest[3] + modulo);
    }
}
