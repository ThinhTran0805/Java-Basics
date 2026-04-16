package org.example;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = "aaaaaAAAAAA1";

        if (pw.length() <= 5) {
            System.out.println("Mat khau khong hop le!");
            return;
        }

        boolean hasUpper = false;
        boolean hasLower = false;

        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }
        if (hasLower && hasUpper) {
            System.out.println("Mat khau hop le!");
        } else {
            System.out.println("Mat khau khong hop le!");
        }

        //cho phep nhap mk de kiem tra, qua 5 lan khong nhap nua.
        int loginAttempts = 0; //so lan nhap mat khau
        int maxAttempts = 5; //gioi han cho phep
        boolean isLoginSuccess = false;

        while (loginAttempts < maxAttempts) {
            System.out.println("Moi nhap mat khau: ");
            String input = sc.nextLine();

            //kiem tra mat khau vua nhap voi mat khau goc
            if (input.equals(pw)) {
                isLoginSuccess = true;
                break;
            } else {
                loginAttempts++;
                int remaining = maxAttempts - loginAttempts;
                if (remaining > 0) {
                    System.out.println("Ban nhap sai roi! Ban con " + remaining + " lan nhap nua");
                }
            }
        }
        if (isLoginSuccess) {
            System.out.println("Mat khau chinh xac! Ban da dang nhap thanh cong!");
        } else {
            System.out.println("Ban nhap SAI qua 5 lan!");
            System.out.println("He thong se thoat trong 3 giay!");
            System.exit(3);
        }
    }
}
