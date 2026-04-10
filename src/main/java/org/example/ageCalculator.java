package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngay = 0, thang = 0, nam = 0;
        LocalDate ngayHienTai = LocalDate.now();
        int namHientai = ngayHienTai.getYear();
        LocalDate ngaySinh = null;

        System.out.println("--- CHUONG TRINH TINH TUOI ---");

        // Vong lap tong de kiem tra toan bo ngay thang nam co hop le hay khong
        while (ngaySinh == null) {
            // 1. Nhap nam (kiem tra nam phai hop ly)
            while (true) {
                System.out.print("Nhap nam sinh cua ban: ");
                nam = sc.nextInt();
                if (nam >= (namHientai - 120) && nam <= ngayHienTai.getYear()) {
                    break;
                }
                System.out.println("Nam sinh khong hop le, nhap lai di!");
            }
            // 2. Nhap thang (tu 1 den 12)
            while (true) {
                System.out.print("Nhap thang sinh cua ban: ");
                thang = sc.nextInt();
                if (thang >= 1 && thang <= 12) {
                    break;
                }
                System.out.println("Nhap tu 1 den 12 thoi!");
            }
            // 3. Nhap ngay
            while (true) {
                System.out.print("Nhap ngay sinh cua ban: ");
                ngay = sc.nextInt();
                if (ngay >= 1 && ngay <= 31) {
                    break;
                }
                System.out.println("Ngay nay khong co tren doi dau, nhap lai nhe!");
            }
            // 4. Buoc cuoi: Kiem tra su ket hop cua ngay/thang/nam (vi du 31/02 la sai)
            try {
                ngaySinh = LocalDate.of(nam, thang, ngay);

                if (ngaySinh.isAfter(ngayHienTai)) {
                    System.out.println("Ban chua sinh ra ma! Nhap lai ca bo thoi.");
                    ngaySinh = null; // Reset de nhap lai tu dau
                }
            } catch (Exception e) {
                System.out.println("Cai thang " + thang + " nay lam gi co ngay " + ngay + "! Nhap lai tu dau di ban hien.");
                ngaySinh = null; // Reset de bat nhap lai tu dau cho chac an
            }
        }

        // Tinh va in ket qua
        Period p = Period.between(ngaySinh, ngayHienTai);
        System.out.println("\n----------------------------------");
        System.out.println("Tinh den hom nay: " + ngayHienTai);
        System.out.println("Ban duoc: " + p.getYears() + " tuoi, "
                + p.getMonths() + " thang, "
                + p.getDays() + " ngay.");

        sc.close();
    }
}