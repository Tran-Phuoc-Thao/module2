package vonglaptrongjava;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int number = 0, n = 0, m = 0;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Nhập 1 : In hình chữ nhật ");
            System.out.println("Nhập 2 : In hình tam giác vuông ");
            System.out.println("Nhập 3 : In tam giác cân ");
            System.out.println("Nhập 4 : Exit ");

            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("nhập chiều dài HCN");
                m = scanner.nextInt();
                System.out.println("nhập chiều rộng HCN");
                n = scanner.nextInt();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }
            }

            if (number == 2) {

                System.out.println("nhập chiều cao tam giác vuông");
                m = scanner.nextInt();
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            if (number == 3) {

                System.out.println("nhập chiều cao tam giác cân");
                m = scanner.nextInt();
                for (int i = 1; i <= m; i++) {
                    for (int j = 1; j <= 2 * m; j++) {
                        if (Math.abs(m - j) <= (i - 1)) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();

                }
            }
            if (number != 1 && number != 2 && number != 3 && number != 4 ){
                System.out.println("Nhập sai rồi nhập lại đi");
            }
        } while (number != 4);
        System.out.println("DONE");
    }

}
