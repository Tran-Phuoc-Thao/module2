package Mangvaphuongthuc;

import java.util.Scanner;

public class bai5_timgiatrinhonhat {
    public static void main(String[] args) {
        int size,min = 0;

        Scanner Scanner = new Scanner(System.in);
        System.out.println(" Nhập kích thước của mảng ");
        size = Scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size ; i++) {
            System.out.print(" Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = Scanner.nextInt();
            if ( array[i] < min ) min = array[i];
        }

        System.out.println("số nhỏ nhất trong mảng vừa nhập là " + min);
    }
}
