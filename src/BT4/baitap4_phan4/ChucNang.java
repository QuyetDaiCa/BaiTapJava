package BT4.baitap4_phan4;

public class ChucNang {
    public static void main(String[] args) {
        People giamDoc = new GiamDoc();
        giamDoc.nhap();
        People truongPhong = new TruongPhong();
        truongPhong.nhap();
        People nhanVien1 = new NhanVien();
        People nhanVien2 = new NhanVien();
        nhanVien1.nhap();
        nhanVien2.nhap();
        giamDoc.xuat();
        truongPhong.xuat();
        nhanVien1.xuat();
        nhanVien2.xuat();
    }
}
