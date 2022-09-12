package baitapthemhtt.bt1.service;

import baitapthemhtt.bt1.model.Student;
import baitapthemhtt.bt1.model.Teacher;
import baitapthemhtt.bt1.repository.TeacherData;

import java.util.ArrayList;
import java.util.List;

public class StudentService {


   public List<Student> hocsinh = new ArrayList<>();

   public void themHocSinh(Student student){

      hocsinh.add(student);
   }

   public void xoaHocSinh(int xoa){
      hocsinh.remove(xoa);
   }


   @Override
   public String toString() {
      return "StudentService{" +
              "hocsinh=" + hocsinh +
              '}';
   }
}
