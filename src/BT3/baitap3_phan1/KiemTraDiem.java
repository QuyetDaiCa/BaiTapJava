package BT3.baitap3_phan1;

import java.util.Scanner;

public class KiemTraDiem {

    static void kiemTra() {//khoảng cách từ tâm o đên a là r2 = (x-a)2 + (y-b)2 O(a,b) A(x,y)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        int r = scanner.nextInt();
        ToaDoDiem toaDoDiemO = new ToaDoDiem();
        ToaDoDiem toaDoDiemA = new ToaDoDiem();
        toaDoDiemO.nhapToaDo();
        toaDoDiemA.nhapToaDo();
        int khoachCachTamDenDiem = (int) Math.sqrt(Math.pow((toaDoDiemA.getHoanhDo() - toaDoDiemO.getHoanhDo()), 2) + Math.pow((toaDoDiemA.getTungDo() - toaDoDiemO.getTungDo()), 2));
        if (khoachCachTamDenDiem == r)
            System.out.println("Điểm A thuộc đường tròn nha");
        else System.out.println("Điểm A không thuộc đường tròn nha");
    }

    public static void main(String[] args) {
        kiemTra();
    }
}
