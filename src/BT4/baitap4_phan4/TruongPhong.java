package BT4.baitap4_phan4;

import java.util.Scanner;

public class TruongPhong extends People {
    private int soLuongNhanVienQuanLy;

    public TruongPhong() {
    }

    public TruongPhong(String name, int namSing, int heSoLuong, float luong, int soLuongNhanVienQuanLy) {
        super(name, namSing, heSoLuong, luong);
        this.soLuongNhanVienQuanLy = soLuongNhanVienQuanLy;
    }

    public int getSoLuongNhanVienQuanLy() {
        return soLuongNhanVienQuanLy;
    }

    public void setSoLuongNhanVienQuanLy(int soLuongNhanVienQuanLy) {
        this.soLuongNhanVienQuanLy = soLuongNhanVienQuanLy;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của Trưởng Phòng ");
        setName(scanner.nextLine());
        System.out.println("Nhập năm sinh của Trưởng Phòng ");
        setNamSing(scanner.nextInt());
        System.out.println("Nhập hệ số lương của Trưởng Phòng");
        setHeSoLuong(scanner.nextInt());
        System.out.println("Nhập sô lương nhân viên mà Trưởng Phòng quản lý ");
        setSoLuongNhanVienQuanLy(scanner.nextInt());
        setLuong(getHeSoLuong() * 2200000);
        System.out.println("=========================================");
    }

    @Override
    public void xuat() {
        System.out.println("Thông tin của Trưởng Phòng ");
        System.out.println("Tên Trưởng Phòng là " + getName());
        System.out.println("Năm sinh của Trưởng Phòng là " + getNamSing());
        System.out.println("Hệ số lương của Trưởng Phòng là " + getHeSoLuong());
        System.out.println("Số lương nhân viên mà Trưởng Phòng quản lý " + getSoLuongNhanVienQuanLy());
        System.out.println("Lương của Trưởng Phòng là " + getLuong());
        System.out.println("=========================================");
    }
}
