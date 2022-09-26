package baitapcogiao;

import java.util.Scanner;

public class Arr {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        int number1=0,number2=0;
        System.out.println("Nhập size Arr");
        size = Integer.parseInt(scanner.nextLine());
        Double arr[] = new Double[size];
        for (int i = 0;i<size;i++){
            System.out.println("Nhập phần tử thứ " +(i+1));
            arr[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("mảng vừa nhập có giá trị là");
        for (int i = 0;i<size;i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();


        for (int i=0;i<size;i++) {
            if (arr[i]%2==0)number1++;
            else number2++;
        }
        System.out.println("mảng vừa nhập có " + number1 +
                " số chẳn và " + number2 + " số lẻ ");





    }
}
