package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecondMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1, 9, 3, 14, 5, 27, 8));
        System.out.println("List goc: " + lst);

        //tao 1 copy list de giu lai List goc -> tim index
        ArrayList<Integer> sortedList = new ArrayList<>(lst);
        Collections.sort(sortedList);
        System.out.println("List sap xep tang dan: " + sortedList);

        //lay so lon nhat thu 2 va so nho nhat thu 2
        int min2nd = sortedList.get(1);
        int max2nd = sortedList.get(sortedList.size() - 2);

        //lay vi tri index
        int indexMin2nd = lst.indexOf(min2nd);
        int indexMax2nd = lst.indexOf(max2nd);

        System.out.println("So lon nhat thu 2 la: " + max2nd + " va so nho nhat thu 2 la: " + min2nd);
        System.out.println("Vi tri cua so lon nhat thu 2 la: " + indexMax2nd + " va so nho nhat thu 2 la: " + indexMin2nd);
    }
}
