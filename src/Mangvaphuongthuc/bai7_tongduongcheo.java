package Mangvaphuongthuc;

import java.util.Scanner;

public class bai7_tongduongcheo {
    public static void main(String[] args) {
        int array[][];

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập độ lớn của ma trận hình vuông");
        int size = scanner.nextInt();

        array = new int[size][size];


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Nhập phần tử thứ [" + (i + 1) + "] [" + (j + 1) + "]");
                array[i][j] = scanner.nextInt();

            }
        }
        System.out.println("ma trận vừa nhập là : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum1=0,sum2=0;

        for (int i = 0; i < size; i++) {
            sum1 += array[i][i];
        }
        for (int i = size-1; i >= 0; i--) {
            sum2 += array[i][i];
        }

        System.out.println("tổng của đường chéo thứ 1 là : " + sum1);
        System.out.println("tổng của đường chéo thứ 2 là : " + sum2);

    }
}
