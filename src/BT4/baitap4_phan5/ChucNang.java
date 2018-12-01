package BT4.baitap4_phan5;

import java.util.ArrayList;

public class ChucNang {
    public static void main(String[] args) {
        GiaoDich giaoDichNha1 = new GiaoDichNha(111, 20, 9, 2013, 20000, 20, "B", "Nhà Hàng Gõ");
        GiaoDich giaoDichNha2 = new GiaoDichNha(112, 25, 8, 2013, 25000, 20, "A", "Nhà Hàng Gai");
        GiaoDich giaoDichDat1 = new GiaoDichDat(115, 20, 9, 2013, 40000, 30, "cao cấp");
        GiaoDich giaoDichDat2 = new GiaoDichDat(115, 25, 8, 2013, 50000, 30, "thường");
        giaoDichNha1.xuat();
        giaoDichNha2.xuat();
        giaoDichNha1.tongLoai();
        giaoDichDat1.xuat();
        giaoDichDat2.xuat();
        giaoDichDat1.tongLoai();
    }
}
