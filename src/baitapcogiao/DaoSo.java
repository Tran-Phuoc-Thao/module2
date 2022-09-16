package baitapcogiao;

import java.util.Scanner;

public class DaoSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n");
        int n = Integer.parseInt(scanner.nextLine());
        double number = 0;
        int dau = -1;
        for (int i = 1; i <= n; i++) {
            number += 1 / i;
            if(i!=n)System.out.print("1/" + i + " + " + dau +"x");
            else System.out.println("1/" + i );
            dau *= -1;
            number *= dau;

        }
        System.out.print("=" + number);
    }
}
