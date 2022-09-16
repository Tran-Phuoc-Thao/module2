package baitapthemhtt.bt2.service;

import baitapthemhtt.bt2.model.Oto;
import baitapthemhtt.bt2.repository.OtoData;

import java.util.List;

public class OtoService implements IPhuongTienGiaoThongServ<Oto> {
    OtoData otoData=new OtoData();

    public void them(Oto oto){
        otoData.them(oto);
    }

    public List<Oto> hienThiOto() {
        return otoData.findALL();
    }

    public void xoa(int bienKiemSoat){
        otoData.xoa(bienKiemSoat);
    }

    public void search(int bienKiemSoat){
        otoData.search(bienKiemSoat);
    }
}
