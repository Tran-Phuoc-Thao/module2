package Mangvaphuongthuc;

import java.util.Scanner;

public class bai6_tinhtongcot {
    public static void main(String[] args) {

        int array[][];

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhập chiều dài ma trận");
        int size1 = scanner.nextInt();

        System.out.printf("Nhập chiều rộng ma trận");
        int size2 = scanner.nextInt();

        array = new int[size1][size2];


        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.printf("Nhập phần tử thứ [" + (i + 1) + "] [" + (j + 1) + "]");
                array[i][j] = scanner.nextInt();

            }
        }
        System.out.println("ma trận vừa nhập là : ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum=0,index;
        System.out.println("muốn tính tổng cột mấy : ");
        index = scanner.nextInt()-1;

        for (int i = 0; i < size1; i++) {
          sum += array[i][index];
        }

        System.out.println("tổng cột " + index + " : " + sum);
    }
}
