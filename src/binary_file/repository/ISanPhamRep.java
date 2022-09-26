package binary_file.repository;

import binary_file.model.SanPham;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ISanPhamRep<E> {
    void them(E sp) throws IOException, ClassNotFoundException;
    void xoa(int id) throws IOException, ClassNotFoundException;
    void search(int id);
    List<E> findAll() throws IOException, ClassNotFoundException;
}
