package baitapthemhtt.bt2.service;


import baitapthemhtt.bt2.model.XeTai;
import baitapthemhtt.bt2.repository.XeTaiData;

import java.util.List;

public class XeTaiService {
    XeTaiData xeTaiData = new XeTaiData();
    public void themMoiXeTai(XeTai xeTai){
        xeTaiData.themXeTai(xeTai);
    }
    public List<XeTai> hienThiXeTai(){
        return xeTaiData.findAll();
    }
    public void removeXeTai(int bienKiemSoat){
        xeTaiData.removeXeTai(bienKiemSoat);
    }
    public void searchXeTai(int bienKiemSoat){
        xeTaiData.searchXeTai(bienKiemSoat);
    }
}
