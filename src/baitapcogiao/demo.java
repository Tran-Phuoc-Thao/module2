package baitapcogiao;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=0;
        try {
             number=Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("123");
        }


        if(number==1) System.out.println("1");
        if(number==2) System.out.println("2");
        if(number==3) System.out.println("3");

    }
}
