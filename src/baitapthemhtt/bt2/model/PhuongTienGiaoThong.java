package baitapthemhtt.bt2.model;

import java.util.Objects;

public abstract class PhuongTienGiaoThong {
    private int bienkiemsoat;
    private String tenhang;
    private String namsanxuat;
    private String chusohuu;

    public PhuongTienGiaoThong(int bienkiemsoat, String tenhang, String namsanxuat, String chusohuu) {
        this.bienkiemsoat = bienkiemsoat;
        this.tenhang = tenhang;
        this.namsanxuat = namsanxuat;
        this.chusohuu = chusohuu;
    }

    public PhuongTienGiaoThong(int bienkiemsoat) {
        this.bienkiemsoat = bienkiemsoat;
    }

    public int getBienkiemsoat() {
        return bienkiemsoat;
    }

    public void setBienkiemsoat(int bienkiemsoat) {
        this.bienkiemsoat = bienkiemsoat;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(String namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public String getChusohuu() {
        return chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        this.chusohuu = chusohuu;
    }

    @Override
    public String toString() {
        return
                "bienkiemsoat=" + bienkiemsoat +
                        ", tenhang='" + tenhang + '\'' +
                        ", namsanxuat='" + namsanxuat + '\'' +
                        ", chusohuu='" + chusohuu + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhuongTienGiaoThong)) return false;
        PhuongTienGiaoThong that = (PhuongTienGiaoThong) o;
        return bienkiemsoat == that.bienkiemsoat;
    }

}
