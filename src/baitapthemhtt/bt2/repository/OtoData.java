package baitapthemhtt.bt2.repository;

import baitapthemhtt.bt2.model.Oto;

import java.util.ArrayList;
import java.util.List;

public class OtoData implements IPhuongTienGiaoThongRep<Oto> {
    public List<Oto> oto = new ArrayList<>();

    public void them(Oto newoto) {
        oto.add(newoto);
    }

    public List<Oto> findALL(){
        return oto;
    }



    public void xoa(int bienKiemSoat) {
        int index = oto.indexOf(new Oto(bienKiemSoat));
        if(index != -1){
            oto.remove(index);
            System.out.println("xóa thành công");
        } else {
            System.out.println("biển kiểm soát không hợp lệ..");
        }

    }
    public void search(int bienKiemSoat){
        int index =oto.indexOf(new Oto(bienKiemSoat));
        if (index != -1){
            System.out.println(oto.get(index));;
        }else {
            System.out.println("không tìm thấy");
        }
    }
}
