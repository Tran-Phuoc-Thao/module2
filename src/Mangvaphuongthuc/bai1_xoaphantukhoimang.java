package Mangvaphuongthuc;

import java.util.Scanner;

public class bai1_xoaphantukhoimang {
    public static int Index(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int size, so;

        Scanner Scanner = new Scanner(System.in);
        System.out.println(" Nhập kích thước của mảng < 20 ");

        do {
            size = Scanner.nextInt();
        } while (size > 20);

         int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(" Nhập phần tử thứ " + (i + 1));
            array[i] = Scanner.nextInt();
        }

        System.out.println("Nhập phần tử cần xóa");
        so = Scanner.nextInt();

        if (Index(so, array) == -1) {
            System.out.print("So can xoa khong co trong mang");

        } else {
            int index = Index(so, array);
            System.out.println("mảng trước khi xóa là ");
            for (int i : array) {
                System.out.print(i + "\t");
            }
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
            System.out.println("mảng sau khi xóa là ");
            for (int i : array) {
                System.out.print(i + "\t");
            }
        }

    }


}
