package baitapcogiao;

import java.util.Scanner;

public class NhaHang {

    public static void main(String[] args) {
        int ca = 50000;
        int rau = 5000;
        int thit = 70000;
        int canh = 50000;
        boolean check;
        double tinhtien = 0;
        double tinhtien2 = 0;
        Scanner scanner = new Scanner(System.in);
        int number1, number = 0;
        do {
            do {

                try {
                    check = false;
                    System.out.println("----Thực đơn nhà hàng----");
                    System.out.println("1.Cá (50k)");
                    System.out.println("2.Rau (5k)");
                    System.out.println("3.Thit (70k)");
                    System.out.println("4.Canh (50k)");
                    System.out.println("5.Nhập Discout và Tính Tiền");


                    number = Integer.parseInt(scanner.nextLine());


                    switch (number) {
                        case 1:
                            tinhtien += ca;
                            System.out.println("cảm ơn quý khách đã gọi Cá");
                            break;
                        case 2:
                            tinhtien += rau;
                            System.out.println("cảm ơn quý khách đã gọi rau");
                            break;
                        case 3:
                            tinhtien += thit;
                            System.out.println("cảm ơn quý khách đã gọi thịt");
                            break;
                        case 4:
                            tinhtien += canh;
                            System.out.println("cảm ơn quý khách đã gọi canh");
                            break;
                        case 5:
                            System.out.println("1.Member");
                            System.out.println("2.Silver");
                            System.out.println("3.Gold");
                            number1 = Integer.parseInt(scanner.nextLine());
                            if (number1 == 2) {
                                System.out.println("DISCOUNT 1%");
                                System.out.println("Bạn được giảm" + (tinhtien / 100));
                                tinhtien2 = tinhtien - (tinhtien * 1 / 100);
                                System.out.println("Số tiền phai trả : " + tinhtien2);
                                System.out.println("Bạn có chắc chắn thoát");
                                System.out.println("1.YES");
                                System.out.println("2.NO");
                                number = Integer.parseInt(scanner.nextLine());
                                if (number == 1) System.exit(0);

                            }
                            if (number1 == 3) {
                                System.out.println("DISCOUNT 2%");
                                System.out.println("Bạn được giảm " + (tinhtien * 2 / 100));
                                tinhtien2 = tinhtien - (tinhtien * 2 / 100);
                                System.out.println("Số tiền phải trả : " + tinhtien2);
                                System.out.println("Bạn có chắc chắn thoát");
                                System.out.println("1.YES");
                                System.out.println("2.NO");
                                number = Integer.parseInt(scanner.nextLine());
                                if (number == 1) System.exit(0);

                            }
                            if (number1 == 1) {
                                System.out.println("bạn không có discout");
                                System.out.println("Số tiền Bạn Phải Trả : " + tinhtien);
                                System.out.println("Bạn có chắc chắn thoát");
                                System.out.println("1.YES");
                                System.out.println("2.NO");
                                number = Integer.parseInt(scanner.nextLine());
                                if (number == 1) System.exit(0);
                            }
                            break;
                        default:
                            if (number > 6 || number < 0) System.out.println("nhập sai định dạng mời nhập lại");
                    }

                } catch (Exception e) {
                    System.out.println("nhập sai định dạng mời nhập lại");
                    check = true;
                }

            } while (check || number < 0 || number > 5);
        } while (true);

    }


}
