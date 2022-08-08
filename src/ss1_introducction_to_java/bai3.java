package ss1_introducction_to_java;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        final int USD = 23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số USD ");
        int vnd = scanner.nextInt();
        vnd *= USD;
        System.out.println("USD -> vn" + vnd + "Đ");
    }
}
