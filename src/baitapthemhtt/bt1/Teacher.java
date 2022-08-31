package baitapthemhtt.bt1;

import java.util.Scanner;

public class Teacher {

    private String ma;
    private String ten;
    private String ngaysinh;
    private String gioitinh;
    private String chuyenmon;

    public Teacher(String ma, String ten, String ngaysinh, String gioitinh, String chuyenmon) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.chuyenmon = chuyenmon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", chuyenmon='" + chuyenmon + '\'' +
                '}';
    }
}
