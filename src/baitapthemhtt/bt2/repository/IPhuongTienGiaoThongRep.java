package baitapthemhtt.bt2.repository;


public interface IPhuongTienGiaoThongRep<E> {
     void them(E oto);
     void xoa(int bienKiemSoat);
     void search(int bienKiemSoat);
}
