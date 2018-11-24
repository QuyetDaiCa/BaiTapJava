package BT3.baitap3_phan1;

import java.util.Scanner;

public class ToaDoDiem {
    private int tungDo;
    private int hoanhDo;

    public ToaDoDiem() {
    }

    public ToaDoDiem(int tungDo, int hoanhDo) {
        this.tungDo = tungDo;
        this.hoanhDo = hoanhDo;
    }

    public int getTungDo() {
        return tungDo;
    }

    public void setTungDo(int tungDo) {
        this.tungDo = tungDo;
    }

    public int getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    void nhapToaDo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hoành độ ");
        int hoanhDo = scanner.nextInt();
        setHoanhDo(hoanhDo);
        System.out.println("Nhập tung độ ");
        int tungDo = scanner.nextInt();
        setTungDo(tungDo);
    }
}
