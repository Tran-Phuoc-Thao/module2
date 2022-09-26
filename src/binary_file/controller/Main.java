package binary_file.controller;

import binary_file.model.SanPham;
import binary_file.repository.SanPhamRep;
import binary_file.service.SanPhamServ;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SanPhamServ sanPhamServ = new SanPhamServ();
        int number;
        do {
            System.out.println("-----Quản Lý Sản Phẩm-----");
            System.out.println("1.Thêm");
            System.out.println("2.Hiển Thị");
            System.out.println("3.Xóa");
            System.out.println("4.Tìm Kiếm");
            System.out.println("5.Copy File");
            System.out.println("6.Hiển thị File Copy");

            number = Integer.parseInt(scanner.nextLine());

            switch (number) {
                case 1:
                    int id;
                    String name, hang, gia, mota;

                    System.out.println("Nhập id sản phẩm");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên sản phẩm");
                    name = scanner.nextLine();
                    System.out.println("Nhập hãng sản xuất");
                    hang = scanner.nextLine();
                    System.out.println("Nhập giá");
                    gia = scanner.nextLine();
                    System.out.println("Nhập mô tả khác");
                    mota = scanner.nextLine();
                    SanPham sanPham = new SanPham(id,name,hang,gia,mota);

                    try {
                        sanPhamServ.them(sanPham);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    List<SanPham> list = sanPhamServ.findAll();
                    for (SanPham sanpham: list) {
                        System.out.println(sanpham);
                    }
                    break;
                case 3:
                    System.out.println("Nhập id muốn xóa");
                    id=Integer.parseInt(scanner.nextLine());


                    try {
                        sanPhamServ.xoa(id);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }

                    break;

                case 4:
                    System.out.println("Nhập id muốn tìm");
                    id=Integer.parseInt(scanner.nextLine());
                    sanPhamServ.search(id);
                    break;
                case 5:
                    sanPhamServ.fileCopy();
                    System.out.println("copy thành công");
                    break;
               case 6:
                    sanPhamServ.docFileCopy();
                    break;
            }


        } while (number != 7);
    }
}
