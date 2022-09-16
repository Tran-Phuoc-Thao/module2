package QuanLySanPham.model;

import java.util.Objects;

public class AbsProduct implements Comparable<AbsProduct> {
    private String id;
    private String name;
    private double price;

    public AbsProduct(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public AbsProduct() {

    }

    public AbsProduct(String id) {
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbsProduct that = (AbsProduct) o;
        return id.equals(that.id);
    }


    @Override
    public int compareTo(AbsProduct o) {
        return Integer.parseInt(this.id) - Integer.parseInt(o.id);
    }
}
