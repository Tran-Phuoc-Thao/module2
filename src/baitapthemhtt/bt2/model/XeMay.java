package baitapthemhtt.bt2.model;

public class XeMay extends PhuongTienGiaoThong{
private int CongSuat;

    public XeMay(int bienkiemsoat, String tenhang, String namsanxuat, String chusohuu, int congSuat) {
        super(bienkiemsoat, tenhang, namsanxuat, chusohuu);
        CongSuat = congSuat;
    }

    public XeMay(int bienkiemsoat) {
        super(bienkiemsoat);
    }

    public int getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(int congSuat) {
        CongSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString()+
                "CongSuat=" + CongSuat ;
    }
}
