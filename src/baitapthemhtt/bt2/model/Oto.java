package baitapthemhtt.bt2.model;

public class Oto extends PhuongTienGiaoThong {

    private int chongoi;
    private String kieuxe;

    public Oto(int bienkiemsoat, String tenhang, String namsanxuat, String chusohuu, int chongoi, String kieuxe) {
        super(bienkiemsoat, tenhang, namsanxuat, chusohuu);
        this.chongoi = chongoi;
        this.kieuxe = kieuxe;
    }

    public Oto(int bienkiemsoat) {
        super(bienkiemsoat);
    }

    public static void remove(int index) {
    }

    public int getChongoi() {
        return chongoi;
    }

    public void setChongoi(int chongoi) {
        this.chongoi = chongoi;
    }

    public String getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(String kieuxe) {
        this.kieuxe = kieuxe;
    }

    @Override
    public String toString() {
        return super.toString()+
                "chongoi=" + chongoi +
                ", kieuxe=" + kieuxe ;
    }
}
