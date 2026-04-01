package org.example;

import java.util.Scanner;

public class InvoiceManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tongTien = 0;
        double giaMonHang;

        System.out.println("======= HE THONG TINH HOA DON =======");
        System.out.println("(Luu y: Nhap so 0 de ket thuc nhap hang)");

        // 1. Vong lap nhap nhieu mon hang
        do {
            System.out.print("Nhap gia tien mon hang: ");
            giaMonHang = sc.nextDouble();

            if (giaMonHang > 0) {
                tongTien += giaMonHang;
                System.out.printf("-> Da cong vao gio hang. Tong hien tai: %,.0f VND%n", tongTien);
            } else if (giaMonHang < 0) {
                System.out.println("!! Gia tien khong hop le, vui long nhap lai.");
            }
        } while (giaMonHang != 0);

        System.out.println("-------------------------------------");
        System.out.printf("Tong tien hang chua chiet khau: %,.0f VND%n", tongTien);

        // 2. Tinh chiet khau (Toan tu 3 ngoi) - Giam 10% neu tren 500k
        double sauChietKhau = (tongTien > 500000) ? tongTien * 0.9 : tongTien;
        if (tongTien > 500000) {
            System.out.println("(*) Ban duoc giam 10% do hoa don tren 500.000 VND");
        }

        // 3. Phuong thuc thanh toan (Switch expression)
        System.out.println("\nVui long chon phuong thuc thanh toan:");
        System.out.println("1. Tien mat (Giu nguyen gia)");
        System.out.println("2. Vi dien tu (Giam them 2% tren gia da chiet khau)");
        System.out.print("Lua chon cua ban: ");
        int phuongThuc = sc.nextInt();

        double thanhToanCuoiCung = switch (phuongThuc) {
            case 1 -> sauChietKhau;
            case 2 -> {
                System.out.println("(*) Ban duoc giam them 2% khi thanh toan qua Vi dien tu");
                yield sauChietKhau * 0.98;
            }
            default -> {
                System.out.println("!! Sai phuong thuc, tinh theo gia sau chiet khau goc.");
                yield sauChietKhau;
            }
        };

        // 4. In ket qua cuoi cung
        System.out.println("=====================================");
        System.out.printf("SO TIEN CUOI CUNG PHAI TRA: %,.2f VND%n", thanhToanCuoiCung);
        System.out.println("=====================================");
        System.out.println("Cam on quy khach. Hen gap lai!");

        sc.close();
    }
}