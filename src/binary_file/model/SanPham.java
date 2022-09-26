package binary_file.model;

import java.io.Serializable;
import java.util.Objects;

public class SanPham implements Serializable {
    private int id;
    private String name;
    private String hangSx;
    private String price;
    private String moTaSp;

    public SanPham(int id) {
        this.id = id;
    }

    public SanPham(int id, String name, String hangSx, String price, String moTaSp) {
        this.id = id;
        this.name = name;
        this.hangSx = hangSx;
        this.price = price;
        this.moTaSp = moTaSp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMoTaSp() {
        return moTaSp;
    }

    public void setMoTaSp(String moTaSp) {
        this.moTaSp = moTaSp;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangSx='" + hangSx + '\'' +
                ", price='" + price + '\'' +
                ", moTaSp='" + moTaSp + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanPham sanPham = (SanPham) o;
        return id == sanPham.id;
    }

}
