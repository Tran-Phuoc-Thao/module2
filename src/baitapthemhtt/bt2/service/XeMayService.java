package baitapthemhtt.bt2.service;


import baitapthemhtt.bt2.model.XeMay;
import baitapthemhtt.bt2.repository.XeMayData;

import java.util.List;

public class XeMayService {
    XeMayData xeMayData = new XeMayData();
    public void themMoiXeMay(XeMay xeMay){
        xeMayData.themXeMay(xeMay);
    }
    public List<XeMay> hienThiXeMay(){
       return xeMayData.findAll();
    }
    public void removeXeMay(int bienKiemSoat){
        xeMayData.removeXeMay(bienKiemSoat);
    }
    public void searchXeMay(int bienKiemSoat){
        xeMayData.searchXeMay(bienKiemSoat);
    }
}
