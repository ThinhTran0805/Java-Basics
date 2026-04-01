package org.example;

public class soHoanthien {
    public static void main(String[] args) {
        System.out.println("Cac so hoan thien tu 1 den 1000 la: ");
        for (int i = 1; i <= 1000; i++){
            int tongUoc = 0;
            for (int j = 1; j <= i / 2; j++){
                if (i % j == 0){
                    tongUoc += j;
                }
            }
            if (tongUoc == i && i != 0){
                System.out.println(i);
            }
        }
    }
}
