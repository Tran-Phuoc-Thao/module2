package baitapcogiao;

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double dienTich,chuVi;
        do {
            System.out.println("Nhập lựa chọn của bạn");
            System.out.println("1.Hình Tròn");
            System.out.println("2.Hình Chữ Nhật");
            System.out.println("3.Tam Giác");
            System.out.println("4.Exit");
            number = Integer.parseInt(scanner.nextLine());

            switch (number){
                case 1:
                    double banKinh;
                    do {
                        System.out.println("Nhập bán kính hình tròn");
                        banKinh = Double.parseDouble(scanner.nextLine());
                    }while (banKinh<0);
                    dienTich = banKinh*banKinh*Math.PI;
                    chuVi = banKinh*2*Math.PI;
                    System.out.println("chu vi" + chuVi);
                    System.out.println("diện tích" + dienTich);
                    break;
                case 2:
                    double dai,rong;
                    do {
                        System.out.println("Nhập chiều dài Hình Chữ Nhật");
                        dai = Double.parseDouble(scanner.nextLine());
                        System.out.println("Nhập bán kính hình tròn");
                        rong = Double.parseDouble(scanner.nextLine());
                    }while (dai<0 || rong<0);
                    chuVi = (dai+rong)*2;
                    dienTich = dai*rong;
                    System.out.println("chu vi" + chuVi);
                    System.out.println("diện tích" + dienTich);
                    break;
                case 3:
                    double day1,day2,day3,cao;
                       System.out.println("Nhập Cạnh bên tam giác");
                       day1 = Double.parseDouble(scanner.nextLine());
                       System.out.println("Nhập cạnh bên tam giác");
                       day2 = Double.parseDouble(scanner.nextLine());
                       System.out.println("Nhập cạnh đáy tam giác");
                       day3 = Double.parseDouble(scanner.nextLine());
                       System.out.println("Nhập chiều cao tam giác");
                       cao = Double.parseDouble(scanner.nextLine());
                    dienTich = (day3*cao)/2;
                    chuVi =day1+day2+day3;
                    System.out.println("chu vi" + chuVi);
                    System.out.println("diện tích" + dienTich);
                    break;
            }
        }while (number != 4);




    }
}
