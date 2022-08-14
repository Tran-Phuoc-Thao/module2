package Mangvaphuongthuc;

import java.util.Scanner;

public class bai3_gopmang {
    public static void main(String[] args) {
        int size1, size2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập kích thước mảng 1 : ");
        size1 = scanner.nextInt();

        int array1[] = new int[size1];

        for (int i = 0; i < size1; i++) {

            System.out.print(" Nhập phần tử thứ " + (i + 1) + " : ");
            array1[i] = scanner.nextInt();

        }

        for (int i : array1) {
            System.out.print(i + "\t");
        }System.out.println();

        System.out.println("nhập kích thước mảng 2 : ");
        size2 = scanner.nextInt();

        int array2[] = new int[size2];

        for (int i = 0; i < size2; i++) {

            System.out.print(" Nhập phần tử thứ " + (i + 1) + " : ");
            array2[i] = scanner.nextInt();

        }

        for (int i : array2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int size = size1 + size2;
        int array3[] = new int[size];

        System.arraycopy(array1,0,array3,0,size1);//1 mảng cần sao chép
        System.arraycopy(array2,0,array3,size1,size2);   //2 vị trí bắt đầu sao chép
                                                                // 3 sao chép đến mảng đích
                                                                // 4 vị trí bắt đầu sao chép ở mảng đích
                                                                // 5 số lượng phần tử sao chép

        for (int i : array3) {
            System.out.print(i + "\t");
        }

    }
}
