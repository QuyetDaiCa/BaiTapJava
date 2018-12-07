package BT5.baitap5_phan4;

public class SinhVien {
    private int maSV;
    private String name;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(int maSV, String name, float diemTB) {
        this.maSV = maSV;
        this.name = name;
        this.diemTB = diemTB;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
}
