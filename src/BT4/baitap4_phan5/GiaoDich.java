package BT4.baitap4_phan5;

public abstract class GiaoDich {
    private int maGiaoDich;
    private int ngayGiaoDich;
    private int thangGiaoDich;
    private int namGiaoDich;
    private float donGia;
    private float dienTich;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, float donGia, float dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.thangGiaoDich = thangGiaoDich;
        this.namGiaoDich = namGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public int getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(int ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getThangGiaoDich() {
        return thangGiaoDich;
    }

    public void setThangGiaoDich(int thangGiaoDich) {
        this.thangGiaoDich = thangGiaoDich;
    }

    public int getNamGiaoDich() {
        return namGiaoDich;
    }

    public void setNamGiaoDich(int namGiaoDich) {
        this.namGiaoDich = namGiaoDich;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public abstract void xuat();

    public abstract float thanhTien();

    public abstract void tongLoai();
}
