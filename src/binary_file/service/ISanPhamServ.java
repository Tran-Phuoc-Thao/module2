package binary_file.service;

import java.io.IOException;
import java.util.List;

public interface ISanPhamServ<E> {
    void them(E sp) throws IOException, ClassNotFoundException;
    void xoa(int id) throws IOException, ClassNotFoundException;
    void search(int id) throws IOException, ClassNotFoundException;
    List<E> findAll() throws IOException, ClassNotFoundException;
}
