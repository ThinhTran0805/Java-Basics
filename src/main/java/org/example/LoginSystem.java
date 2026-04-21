package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "123456");
        users.put("thinh_tran", "thinh2026");
        users.put("teo_saigon", "teovip123");
        users.put("banh_mi", "saigon_oi");
        users.put("caphe_sua", "ngon_qua");
        users.put("user_01", "pass_01");
        users.put("coding_pro", "java_de_ot");
        users.put("mientay_oi", "songnuoc");
        users.put("saigon_75", "hoainiem");
        users.put("gemini_ai", "google_bot");

        //Nhap username va password
        System.out.println("Nhap username: ");
        String username = sc.nextLine();
        System.out.println("Nhap password: ");
        String password = sc.nextLine();

        if (!users.containsKey(username)) {
            System.out.println("Khong tim thay user: ");
        } else if (!users.get(username).equals(password)) {
            System.out.println("Sai Password!");
        } else {
            System.out.println("Login thanh cong");c
        }
    }
}
