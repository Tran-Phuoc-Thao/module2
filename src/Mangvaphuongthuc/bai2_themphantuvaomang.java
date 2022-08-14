package Mangvaphuongthuc;

import java.util.Scanner;

public class bai2_themphantuvaomang {
    public static void sx(int x,int array[]){
        for (int i = array.length-2 ; i >= x; i --){

            array[i+1]=array[i];

        }

    }


    public static void main(String[] args) {
        int size, so, index;

        Scanner Scanner = new Scanner(System.in);
        System.out.println(" Nhập kích thước của mảng ");
        size = Scanner.nextInt();

        int array[] = new int[size+1];

        for (int i = 0; i < size ; i++) {
            System.out.print(" Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = Scanner.nextInt();

        }


        System.out.println("nhập số cần chèn : ");
        so = Scanner.nextInt();
        System.out.println("nhập vị trí cần chèn : ");
        index = Scanner.nextInt() - 1;
        sx(index,array);
        array[index]=so;

        System.out.println("mảng sau khi chèn là : ");
        for (int i : array) {
            System.out.print(i + "\t");
        }




    }

}
