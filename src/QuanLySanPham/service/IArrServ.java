package QuanLySanPham.service;

import java.util.List;

public interface IArrServ<E> {
    void add(E element);
    void remove(String id);
    List<E> getAll();

}
