package baitapthemhtt.bt2.repository;

import baitapthemhtt.bt2.model.Oto;
import baitapthemhtt.bt2.model.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayData {
    public List<XeMay> xeMay = new ArrayList<>();


    public void themXeMay(XeMay newXeMay) {
        xeMay.add(newXeMay);
    }

    public List<XeMay> findAll() {
        return xeMay;
    }

    public void removeXeMay(int bienKiemSoat) {
        int index = xeMay.indexOf(new XeMay(bienKiemSoat));
        if (index != -1) {
            xeMay.remove(index);
            System.out.println("xóa thành công");
        } else {
            System.out.println("biển kiểm soát không hợp lệ..");
        }

    }

    public void searchXeMay(int bienKiemSoat) {
        int index = xeMay.indexOf(new XeMay(bienKiemSoat));
        if (index != -1) {
            System.out.println(xeMay.get(index));
        } else {
            System.out.println("không tìm thấy");
        }
    }
}
