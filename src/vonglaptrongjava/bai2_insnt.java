package vonglaptrongjava;

import java.util.Scanner;

public class bai2_insnt {
    public static void main(String[] args) {
        int number, count = 0, n = 2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ban muon in bao nhieu so");
        number = scan.nextInt();
        while (count < number) {
            if (CheckSNT(n) == 1) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }

    public static int CheckSNT(int so) {
        int d = 0;
        if (so < 2) {
            return 0;
        } else {
            for (int i = 1; i <= so; i++) {
                if (so % i == 0) {
                    d++;
                }
            }
            if (d == 2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
