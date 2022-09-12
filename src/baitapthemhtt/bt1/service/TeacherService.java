package baitapthemhtt.bt1.service;

import baitapthemhtt.bt1.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    public List<Teacher> giaovien = new ArrayList<>();
    public void themGiaovien(Teacher teacher){
        giaovien.add(teacher);
    }
    public void xoaGiaoVien(int xoa){
        giaovien.remove(xoa);
    }

    @Override
    public String toString() {
        return "TeacherService{" +
                "giaovien=" + giaovien +
                '}';
    }
}
