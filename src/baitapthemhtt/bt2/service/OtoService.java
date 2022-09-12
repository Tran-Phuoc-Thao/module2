package baitapthemhtt.bt2.service;

import baitapthemhtt.bt2.model.Oto;
import baitapthemhtt.bt2.repository.OtoData;

import java.util.List;

public class OtoService {
    OtoData otoData=new OtoData();

    public void themMoiOto(Oto oto){
        otoData.them(oto);
    }

    public List<Oto> hienThiOto() {
        return otoData.findALL();
    }

    public void removeOto(int bienKiemSoat){
        otoData.xoa(bienKiemSoat);
    }

    public void searchOto(int bienKiemSoat){
        otoData.search(bienKiemSoat);
    }
}
