package Mangvaphuongthuc;

import java.util.Scanner;

public class bai4_timsolonnhatmang2chieu {
    public static void main(String[] args) {

        int array[][];

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập chiều dài ma trận");
        int size1 = scanner.nextInt();

        System.out.printf("Nhập chiều rộng ma trận");
        int size2 = scanner.nextInt();

        array = new int[size1][size2];

        int max = array[0][0];

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.printf("Nhập phần tử thứ [" + (i + 1) + "] [" + (j + 1) + "]");
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max) max = array[i][j];
            }
        }
        System.out.println("ma trận vừa nhập là : ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" số lớn nhất trong ma trận vừa nhập là " + max);


    }
}
