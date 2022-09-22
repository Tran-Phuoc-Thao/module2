package search;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        String chuoi= sc.nextLine();
        LinkedList<Character> linkedList= new LinkedList<>();
        linkedList.add(chuoi.charAt(0));
        for(int i=1; i<chuoi.length();i++){
            if(chuoi.charAt(i)>linkedList.getLast()){
                linkedList.add(chuoi.charAt(i));
            }
        }
        for(Character character: linkedList){
            System.out.print(character+" ");
        }

    }
}
