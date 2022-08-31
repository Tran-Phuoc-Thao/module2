package baitapthemhtt.bt1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {// mã,tên,ngaysinh,gioitinh,lop,diemso

    private String ma;
    private String ten;
    private String ngaysinh;
    private String gioitinh;
    private String lop;
    private float diemso;

    public Student(String ma, String ten, String ngaysinh, String gioitinh, String lop, float diemso) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.lop = lop;
        this.diemso = diemso;
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

    public String isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemso() {
        return diemso;
    }

    public void setDiemso(float diemso) {
        this.diemso = diemso;
    }

    @Override
    public String toString() {
        return "ma=" + ma + '\n' +
                " ten=" + ten + '\n' +
                " ngaysinh=" + ngaysinh + '\n' +
                " gioitinh=" + gioitinh + '\n' +
                " lop=" + lop + '\n' +
                " diemso=" + diemso + "\n";
    }
}



