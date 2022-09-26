package baitapcogiao;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;


        for (i = 1; i < arr.length; i++) {
            valueToInsert = arr[i];
            holePosition = i;
            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
            }
            if (holePosition != i) {

                arr[holePosition] = valueToInsert;
            }

        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        int arrCopy[]= new int[10];
        for (int i = 0 ; i < 10; i++){
            System.out.println("Nhap phan tu thu " + (i+1));
            arr[i]=Integer.parseInt(scanner.nextLine());
            arrCopy[i]=arr[i];
        }

        Test.insertionSort(arr);
        System.out.println("gia tri be nhat la " + arr[0]);
        System.out.println("nhập số cần tìm trong mảng");
        int number = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < 10 ; i++) {
            if(arr[i] == number) index = i;
        }

        if (index != -1 ){
            System.out.println(number + " có trong mảng ở vị trí " + index);
        }else System.out.println("không tìm thấy");

        System.out.println("mảng trước khi sắp xếp");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(arrCopy[i] + "  ");
        }
        System.out.println();
        System.out.println("mảng sau khi sắp xếp");
        for (int i = 0; i<10;i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
