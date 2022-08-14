package Mangvaphuongthuc;

import java.util.Scanner;

public class bai8_demkytutrongchuoi {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chuỗi");
        string = scanner.nextLine();

        System.out.println("nhập ký tự muốn đếm trong chuỗi");
        String x = scanner.nextLine();

        int dem = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == x.charAt(0)) dem++;
        }

        System.out.println("số lần xuất hiện ký tự " + x + " trong chuỗi là : " + dem);

    }
}
