package QuanLySanPham.service;

import QuanLySanPham.model.AbsProduct;
import QuanLySanPham.repository.IArrRep;
import QuanLySanPham.repository.ProductManagerRep;

import java.util.List;
import java.util.Scanner;

public class ProductManagerServ implements IArrServ<AbsProduct> {
    ProductManagerRep serv = new ProductManagerRep();
    @Override
    public void add(AbsProduct element) {
    serv.add(element);
    }

    @Override
    public void remove(String id) {
    serv.remove(id);
    }

    @Override
    public List<AbsProduct> getAll() {
        return serv.getAll();
    }

    public void search(String id){
        serv.search(id);
    }

    public void sapXep(){
        serv.sapXep();
    }

    public void sua(String id){
        serv.sua(id);

    }

}
