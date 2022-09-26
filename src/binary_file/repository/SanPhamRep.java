package binary_file.repository;

import binary_file.model.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRep implements ISanPhamRep<SanPham> {
    private List<SanPham> sanPham = data();


    public void capnhatFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\codegym\\module2\\src\\binary_file\\repository\\data\\SanPham.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sanPham);
        objectOutputStream.close();
    }

    @Override
    public void them(SanPham sp) throws IOException, ClassNotFoundException {
        sanPham.add(sp);
        capnhatFile();
    }

    @Override
    public void xoa(int id) throws IOException, ClassNotFoundException {

        int index = sanPham.indexOf(new SanPham(id));
        if (index != -1) {
            sanPham.remove(index);
            System.out.println("xóa thành công");
        } else {
            System.out.println("id không hợp lệ..");
        }
        capnhatFile();
    }

    @Override
    public void search(int id) {
        int index = sanPham.indexOf(new SanPham(id));
        if (index != -1) {
            System.out.println(sanPham.get(index));
            ;
        } else {
            System.out.println("không tìm thấy");

        }
    }

    public List<SanPham> data() {
        List<SanPham> result = new ArrayList<>();
        File file1 = new File("D:\\codegym\\module2\\src\\binary_file\\repository\\data\\SanPham.dat");
        if (file1.exists()) {
            ObjectInputStream oif;
            try {
                InputStream inputStream = new FileInputStream(file1);
                oif = new ObjectInputStream(inputStream);
                result = (List<SanPham>) oif.readObject();
                oif.close();
            } catch (EOFException e) {
                System.out.println("Không có dữ liệu");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("123");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return result;
    }

    public void fileCopy(){

        try {

            FileOutputStream fos = new FileOutputStream("D:\\codegym\\module2\\src\\binary_file\\repository\\data\\dataCopy\\fileCopy.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(data());
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<SanPham> hienThiFileCopy(){
        List<SanPham> list = new ArrayList<>();
        File file1 = new File("D:\\codegym\\module2\\src\\binary_file\\repository\\data\\dataCopy\\fileCopy.dat");
        if (file1.exists()) {
            ObjectInputStream oif;
            try {
                InputStream inputStream = new FileInputStream(file1);
                oif = new ObjectInputStream(inputStream);
                list = (List<SanPham>) oif.readObject();
                oif.close();
            } catch (EOFException e) {
                System.out.println("Không có dữ liệu");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("123");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public List<SanPham> findAll(){
        return sanPham;
    }
}
