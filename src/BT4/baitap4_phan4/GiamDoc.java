package BT4.baitap4_phan4;

import java.util.Scanner;

public class GiamDoc extends People {
    private int heSoChucVu;

    public GiamDoc() {
    }
    public GiamDoc(int heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public GiamDoc(String name, int namSing, int heSoLuong, float luong, int heSoChucVu) {
        super(name, namSing, heSoLuong, luong);
        this.heSoChucVu = heSoChucVu;
    }

    public int getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(int heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public void nhap() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập tên của Giám Đốc ");
        setName(scanner.nextLine());
        System.out.println("Nhập năm sinh của Giám Đốc ");
        setNamSing(scanner.nextInt());
        System.out.println("Nhập hệ số lương của Giám Đốc");
        setHeSoLuong(scanner.nextInt());
        System.out.println("Nhập hệ số chức vụ của Giám Đốc ");
        setHeSoChucVu(scanner.nextInt());
        setLuong((getHeSoLuong()+getHeSoChucVu())*3000000);
        System.out.println("======================================");
    }

    @Override
    public void xuat() {
        System.out.println("Thông tin của Giám Đốc ");
        System.out.println("Tên Giám Đốc là " + getName());
        System.out.println("Năm sinh của Giám Đốc là " + getNamSing());
        System.out.println("Hệ số lương của Giám Đốc là " + getHeSoLuong());
        System.out.println("Hệ số chức vụ của Giám Đốc là " + getHeSoChucVu());
        System.out.println("Lương của Giám Đốc là " + getLuong());
        System.out.println("=========================================");
    }



}
