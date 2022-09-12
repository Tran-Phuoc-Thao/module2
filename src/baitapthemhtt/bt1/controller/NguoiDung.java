package baitapthemhtt.bt1.controller;

import baitapthemhtt.bt1.model.Student;
import baitapthemhtt.bt1.model.Teacher;
import baitapthemhtt.bt1.repository.TeacherData;
import baitapthemhtt.bt1.service.StudentService;
import baitapthemhtt.bt1.service.TeacherService;

import java.util.Scanner;

class NguoiDung {

    public static void main(String[] args) {
        int number;
        StudentService data1=new StudentService();
        TeacherService data2=new TeacherService();
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.printf("--CHƯƠNG TRÌNH QUẢN LÝ--" + "\n" +
                    "1.Thêm mới giảng viên hoặc học sinh" + "\n" +
                    "2.xóa giảng viên hoặc học sinh" + "\n" +
                    "3.xem danh sách giảng viên hoặc học sinh" + "\n" +
                    "4.thoát" + "\n");
            float diemso;
            String lop, ten, hienthi, gioitinh, ma, ngay;
            number = Integer.parseInt(scanner.nextLine());
            if (number == 1) {

                System.out.println("2.thêm mới giảng viên" + "\n" +
                        "1.thêm mới học sinh");
                int number1 = Integer.parseInt(scanner.nextLine());
                if (number1 == 1) {

                    System.out.println("Nhập mã HS");
                    ma = scanner.nextLine();
                    System.out.println("Nhập Tên HS");
                    ten = scanner.nextLine();
                    System.out.println("Nhập ngày sinh HS");
                    ngay = scanner.nextLine();
                    System.out.println("Nhập giới tính HS");
                    gioitinh = scanner.nextLine();
                    System.out.println("Nhập lớp HS");
                    lop = scanner.nextLine();
                    System.out.println("Nhập điểm số HS");
                    diemso = Float.parseFloat(scanner.nextLine());
                    Student student = new Student(ma, ten, ngay, gioitinh, lop, diemso);
                    data1.themHocSinh(student);
                }

                if (number1 == 2) {
                    System.out.println("Nhập mã GV");
                    ma = scanner.nextLine();
                    System.out.println("Nhập Tên GV");
                    ten = scanner.nextLine();
                    System.out.println("Nhập ngày sinh GV");
                    ngay = scanner.nextLine();
                    System.out.println("Nhập giới tính GV");
                    gioitinh = scanner.nextLine();
                    System.out.println("Nhập chuyên môn GV");
                    lop = scanner.nextLine();

                    Teacher teacher = new Teacher(ma, ten, ngay, gioitinh, lop);

                    data2.themGiaovien(teacher);
                }

            }

            if (number == 2) {

                System.out.println("2.xóa giảng viên" + "\n" +
                        "1.xóa học sinh");
                int number2 = Integer.parseInt(scanner.nextLine());
                if (number2 == 1) {
                    System.out.println("2.xóa học sinh thứ mấy trong danh sách");
                    int xoa = Integer.parseInt(scanner.nextLine()) - 1;
                    data1.xoaHocSinh(xoa);
                }
                if (number2 == 2) {
                    System.out.println("2.xóa giáo viên thứ mấy trong danh sách");
                    int xoa = Integer.parseInt(scanner.nextLine()) - 1;
                    data2.xoaGiaoVien(xoa);
                }


            }
            if (number == 3) {
                System.out.println("1.xem danh sách giáo viên" + "\n" +
                        "2.xem danh sách học sinh");
                int xem = Integer.parseInt(scanner.nextLine());
                if (xem == 1) {
                   data2.toString();
                }
                if (xem == 2) {
                    data1.toString();
                }


            }

        } while (number != 4);


    }


}