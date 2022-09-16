package baitapthemhtt.bt2.service;

public interface IPhuongTienGiaoThongServ<E> {
    void them(E oto);
    void xoa(int bienKiemSoat);

    void search(int bienKiemSoat);

}
