package BT4.baitap4_phan4;

import java.util.Scanner;

public class NhanVien extends People {
    private String tenDonVi;

    public NhanVien() {
    }

    public NhanVien(String name, int namSing, int heSoLuong, float luong, String tenDonVi) {
        super(name, namSing, heSoLuong, luong);
        this.tenDonVi = tenDonVi;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của Nhân Viên ");
        setName(scanner.nextLine());
        System.out.println("Nhập năm sinh của Nhân Viên ");
        setNamSing(scanner.nextInt());
        System.out.println("Nhập hệ số lương của Nhân Viên");
        setHeSoLuong(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập tên đơn vị của Nhân Viên ");
        setTenDonVi(scanner.nextLine());
        setLuong(getHeSoLuong() * 1250000);
        System.out.println("=========================================");
    }

    @Override
    public void xuat() {
        System.out.println("Thông tin của Nhân Viên ");
        System.out.println("Tên Nhân Viên là " + getName());
        System.out.println("Năm sinh của Nhân Viên là " + getNamSing());
        System.out.println("Hệ số lương của Nhân Viên là " + getHeSoLuong());
        System.out.println("Tên đơn vị của Nhân Viên là " + getTenDonVi());
        System.out.println("Lương của Nhân Viên là " + getLuong());
        System.out.println("=========================================");
    }
}
