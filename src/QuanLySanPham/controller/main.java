package QuanLySanPham.controller;

import QuanLySanPham.model.AbsProduct;
import QuanLySanPham.service.ProductManagerServ;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductManagerServ productManagerServ = new ProductManagerServ();
        double price;
        String id, name;
        int number;

        do {
            System.out.println("---Quản Lý Sản Phẩm---");
            System.out.println("1.Thêm Mới ");
            System.out.println("2.Sửa");
            System.out.println("3.Xóa");
            System.out.println("4.Hiển Thị");
            System.out.println("5.Tìm Kiếm");
            System.out.println("6.Sắp xếp");
            System.out.println("7.Thoát");

            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    System.out.println("nhập id :");
                    id = scanner.nextLine();
                    System.out.println("nhập tên :");
                    name = scanner.nextLine();
                    System.out.println("nhập giá :");
                    price = Double.parseDouble(scanner.nextLine());
                    AbsProduct absProduct = new AbsProduct(id, name, price);
                    productManagerServ.add(absProduct);
                    break;
                case 2:
                    System.out.println("nhập id muon sua :");
                    id = scanner.nextLine();
                    productManagerServ.sua(id);

                    break;
                case 3:
                    System.out.println("nhập id muon xoa :");
                    id = scanner.nextLine();
                    productManagerServ.remove(id);
                    break;
                case 4:
                    List<AbsProduct> absProductList = productManagerServ.getAll();
                    for (AbsProduct absProduct1 : absProductList) {
                        System.out.println(absProduct1);
                    }
                    break;
                case 5:
                    System.out.println("nhập id muon tim kiem :");
                    id = scanner.nextLine();
                    productManagerServ.search(id);
                    break;
                case 6:
                    productManagerServ.sapXep();

            }


        } while (number != 7);

    }
}