package binary_file.service;

import binary_file.model.SanPham;
import binary_file.repository.SanPhamRep;

import java.io.IOException;
import java.util.List;

public class SanPhamServ implements ISanPhamServ<SanPham>{
    SanPhamRep sanPhamRep = new SanPhamRep();
    @Override
    public void them(SanPham sp) throws IOException, ClassNotFoundException {
    sanPhamRep.them(sp);
    }

    @Override
    public void xoa(int id) throws IOException, ClassNotFoundException {
    sanPhamRep.xoa(id);
    }

    @Override
    public void search(int id) {
    sanPhamRep.search(id);
    }

    @Override
    public List<SanPham> findAll() {
        return sanPhamRep.findAll();
    }

    public void fileCopy(){
       sanPhamRep.fileCopy();
    }

    public void docFileCopy(){
       List<SanPham> listCopy = sanPhamRep.hienThiFileCopy();
       for (SanPham sanPham :listCopy){
           System.out.println(sanPham);
       }
    }
}
