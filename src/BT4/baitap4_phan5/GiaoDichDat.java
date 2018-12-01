package BT4.baitap4_phan5;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(int maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, float donGia, float dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    static int count = 0;

    @Override
    public void xuat() {
        System.out.print(getMaGiaoDich() + "   " + getNgayGiaoDich() + "  " + getThangGiaoDich() + "  " +
                getNamGiaoDich() + "   " + getDonGia() + "  " + getDienTich()
                + "   " + getLoaiDat() + "  " + thanhTien() + "\n");
        count++;
    }

    @Override
    public void tongLoai() {
        System.out.println("Tổng giao dịch đất là " + count);
    }

    @Override
    public float thanhTien() {
        float thanhTien = 0;
        if (getLoaiDat().equalsIgnoreCase("thường"))
            thanhTien = getDienTich() * getDonGia() * 0.9f;
        if (getLoaiDat().equalsIgnoreCase("cao cấp"))
            return getDienTich() * getDonGia();
        return 0;
    }
}
