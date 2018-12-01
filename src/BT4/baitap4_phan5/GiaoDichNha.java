package BT4.baitap4_phan5;

import java.util.ArrayList;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(int maGiaoDich, int ngayGiaoDich, int thangGiaoDich, int namGiaoDich, float donGia, float dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, thangGiaoDich, namGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    static int count = 0;

    @Override
    public void xuat() {
        System.out.print(getMaGiaoDich() + "   " + getNgayGiaoDich() + "  " + getThangGiaoDich() + "  " +
                getNamGiaoDich() + "   " + getDonGia() + "  " + getDienTich()
                + "   " + getLoaiNha() + "   " + getDiaChi() + "  " + thanhTien() + "\n");
        count++;
    }


    @Override
    public float thanhTien() {
        if (getLoaiNha().equalsIgnoreCase("A"))
            return getDienTich() * getDonGia() * 1.5f;
        if (getLoaiNha().equalsIgnoreCase("B") || getLoaiNha().equalsIgnoreCase("C"))
            return getDienTich() * getDonGia();
        return 0;
    }

    @Override
    public void tongLoai() {
        System.out.println("Tổng số lượng giao dịch nhà là " + count);
    }


}
