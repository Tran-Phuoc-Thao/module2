package QuanLySanPham.repository;

import java.util.List;

public interface IArrRep<E> {
    void add(E element);
    void remove(String id);
    List<E> getAll();
    void search(String id);
}
