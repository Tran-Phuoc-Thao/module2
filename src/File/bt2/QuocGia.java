package File.bt2;

public class QuocGia {
    private int id;
    private String code;
    private String ten;



    public QuocGia() {
    }


    public QuocGia(int id, String code, String ten) {
        this.id = id;
        this.code = code;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                ", code = " + code + '\'' +
                ", ten=" + ten + '\'' ;

    }



}
