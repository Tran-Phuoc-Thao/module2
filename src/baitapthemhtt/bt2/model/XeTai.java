package baitapthemhtt.bt2.model;

public class XeTai extends PhuongTienGiaoThong {
    private int trongTai;

    public XeTai(int bienkiemsoat, String tenhang, String namsanxuat, String chusohuu, int trongTai) {
        super(bienkiemsoat, tenhang, namsanxuat, chusohuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "trongTai=" + trongTai ;
    }
}
