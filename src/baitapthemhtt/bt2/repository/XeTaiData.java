package baitapthemhtt.bt2.repository;

import baitapthemhtt.bt2.model.Oto;
import baitapthemhtt.bt2.model.XeMay;
import baitapthemhtt.bt2.model.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiData {

    public List<XeTai> xeTai = new ArrayList<>();


    public void themXeTai(XeTai newXeTai) {
        xeTai.add(newXeTai);
    }

    public List<XeTai> findAll(){
        return xeTai;
    }
    public void removeXeTai(int bienkiemsoat) {
        int index = xeTai.indexOf(new Oto(bienkiemsoat));
        if(index != -1){
            xeTai.remove(index);
            System.out.println("xóa thành công");
        } else {
            System.out.println("biển kiểm soát không hợp lệ..");
        }
    }

    public void searchXeTai(int bienKiemSoat){
        int index =xeTai.indexOf(new Oto(bienKiemSoat));
        if (index != -1){
            System.out.println(xeTai.get(index));

        }else {
            System.out.println("không tìm thấy");
        }
    }
}
