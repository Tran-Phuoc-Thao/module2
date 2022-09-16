package QuanLySanPham.repository;

import QuanLySanPham.model.AbsProduct;

import java.util.*;

public class ProductManagerRep implements IArrRep<AbsProduct> {
    List<AbsProduct> data = new ArrayList<>();
    @Override
    public void add(AbsProduct element) {
        data.add(element);
    }

    @Override
    public void remove(String id) {
        int index = data.indexOf(new AbsProduct(id));
        if(index != -1){
            data.remove(index);
            System.out.println("xóa thành công");
        } else {
            System.out.println("biển kiểm soát không hợp lệ..");
        }
    }

    @Override
    public List<AbsProduct> getAll() {
        return data;
    }


    public void search(String id){
        int index = data.indexOf(new AbsProduct(id));
        if (index != -1){
            System.out.println(data.get(index));;
        }else {
            System.out.println("không tìm thấy");
        }
    }

    public void sapXep(){
        Collections.sort(data);
    }

    public void sua(String id1){
        String id,name;
        double price;
        int index = data.indexOf(new AbsProduct(id1));
        if (index != -1){
            System.out.println("nhập id muốn chỉnh sửa");
            Scanner scanner = new Scanner(System.in);
            id = scanner.nextLine();
            System.out.println("nhập tên muốn chỉnh sửa");
            name = scanner.nextLine();
            System.out.println("nhập giá cần chỉnh sửa");
            price = Double.parseDouble(scanner.nextLine());
            data.get(index).setId(id);
            data.get(index).setName(name);
            data.get(index).setPrice(price);
        }else {
            System.out.println("không tìm thấy");
        }
    }
}
