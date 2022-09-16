package baitapthemhtt.bt2.controller;

import baitapthemhtt.bt2.model.Oto;
import baitapthemhtt.bt2.model.XeMay;
import baitapthemhtt.bt2.model.XeTai;
import baitapthemhtt.bt2.service.OtoService;
import baitapthemhtt.bt2.service.XeMayService;
import baitapthemhtt.bt2.service.XeTaiService;

import java.util.List;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OtoService otoService = new OtoService();
        XeMayService xeMayService = new XeMayService();
        XeTaiService xeTaiService = new XeTaiService();
        int number;
        int bienKiemSoat;
        String tenhang, namsanxuat, chusohuu;

        do {
            System.out.println("---Quản Lý Phương Tiện---");
            System.out.println("1.Thêm Mới Phương Tiện");
            System.out.println("2.Hiển Thị Phương Tiện");
            System.out.println("3.Xóa Phương Tiện");
            System.out.println("4.Tìm Kiếm Theo Biển Kiểm Soát");
            System.out.println("5.Thoát");

            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.println("thêm mới phương tiện gì");
                    System.out.println("1.Oto");
                    System.out.println("2.xe máy");
                    System.out.println("3.xe tải");
                    int number1 = Integer.parseInt(scanner.nextLine());
                    if (number1 == 1) {

                        String kieuxe;
                        int chongoi;
                        System.out.println("nhập biển kiểm soát");
                        bienKiemSoat = Integer.parseInt(scanner.nextLine());

                        System.out.println("nhập tenhang");
                        tenhang = scanner.nextLine();

                        System.out.println("nhập năm sản xuất");
                        namsanxuat = scanner.nextLine();

                        System.out.println("nhập chủ sở hữu");
                        chusohuu = scanner.nextLine();

                        System.out.println("nhập số chỗ ngồi");
                        chongoi = Integer.parseInt(scanner.nextLine());

                        System.out.println("nhập kiểu xe");
                        kieuxe = scanner.nextLine();

                        Oto oto = new Oto(bienKiemSoat, tenhang, namsanxuat, chusohuu, chongoi, kieuxe);
                        otoService.them(oto);
                    }

                    if (number1 == 2) {
                        int congSuat;
                        System.out.println("nhập biển kiểm soát");
                        bienKiemSoat = Integer.parseInt(scanner.nextLine());

                        System.out.println("nhập tenhang");
                        tenhang = scanner.nextLine();

                        System.out.println("nhập năm sản xuất");
                        namsanxuat = scanner.nextLine();

                        System.out.println("nhập chủ sở hữu");
                        chusohuu = scanner.nextLine();

                        System.out.println("nhập công suất");
                        congSuat = Integer.parseInt(scanner.nextLine());

                        XeMay xeMay = new XeMay(bienKiemSoat, tenhang, namsanxuat, chusohuu, congSuat);

                        xeMayService.themMoiXeMay(xeMay);
                    }
                    if (number1 == 3) {
                        int trongTai;
                        System.out.println("nhập biển kiểm soát");
                        bienKiemSoat = Integer.parseInt(scanner.nextLine());

                        System.out.println("nhập tenhang");
                        tenhang = scanner.nextLine();

                        System.out.println("nhập năm sản xuất");
                        namsanxuat = scanner.nextLine();

                        System.out.println("nhập chủ sở hữu");
                        chusohuu = scanner.nextLine();

                        System.out.println("nhập công suất");
                        trongTai = Integer.parseInt(scanner.nextLine());
                        XeTai xeTai = new XeTai(bienKiemSoat, tenhang, namsanxuat, chusohuu, trongTai);

                        xeTaiService.themMoiXeTai(xeTai);

                    }
                    break;
                case 2:

                    System.out.println("Hiển Thị Phương Tiện nào");
                    System.out.println("1.Oto");
                    System.out.println("2.xe máy");
                    System.out.println("3.xe tải");
                    number1 = Integer.parseInt(scanner.nextLine());

                    if (number1 == 1) {
                        List<Oto> otoList = otoService.hienThiOto();
                        for (Oto oto : otoList) {
                            System.out.println(oto);
                        }
                    }
                    if (number1 == 2) {
                        List<XeMay> xeMayList = xeMayService.hienThiXeMay();
                        for (XeMay xeMay : xeMayList) {
                            System.out.println(xeMay);
                        }
                    }
                    if (number1 == 3) {
                        List<XeTai> xeTaiList = xeTaiService.hienThiXeTai();
                        for (XeTai xeTai : xeTaiList) {
                            System.out.println(xeTai);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Xóa Phương Tiện nào");
                    System.out.println("1.Oto");
                    System.out.println("2.xe máy");
                    System.out.println("3.xe tải");
                    number1 = Integer.parseInt(scanner.nextLine());
                    if (number1==1){

                        System.out.println("Nhập biển kiểm soát cần xóa");
                        bienKiemSoat=Integer.parseInt(scanner.nextLine());
                        otoService.xoa(bienKiemSoat);

                    }
                    if (number1==2){
                        System.out.println("Nhập biển kiểm soát cần xóa");
                        bienKiemSoat=Integer.parseInt(scanner.nextLine());
                        xeMayService.removeXeMay(bienKiemSoat);
                    }

                    if(number1==3){
                        System.out.println("Nhập biển kiểm soát cần xóa");
                        bienKiemSoat=Integer.parseInt(scanner.nextLine());
                        xeTaiService.removeXeTai(bienKiemSoat);
                    }
                    break;
                case 4:
                    System.out.println("Tìm Phương Tiện nào");
                    System.out.println("1.Oto");
                    System.out.println("2.xe máy");
                    System.out.println("3.xe tải");
                    number1 = Integer.parseInt(scanner.nextLine());

                    if (number1==1){

                        System.out.println("Nhập biển kiểm soát cần tìm");
                        bienKiemSoat=Integer.parseInt(scanner.nextLine());
                        otoService.search(bienKiemSoat);

                    }
                    if (number1==2){
                        System.out.println("Nhập biển kiểm soát cần tìm");
                        bienKiemSoat=Integer.parseInt(scanner.nextLine());
                        xeMayService.searchXeMay(bienKiemSoat);
                    }

                    if(number1==3){
                        System.out.println("Nhập biển kiểm soát cần tìm");
                        bienKiemSoat=Integer.parseInt(scanner.nextLine());
                        xeTaiService.searchXeTai(bienKiemSoat);
                    }
            }

        } while (number != 5);
    }


}
