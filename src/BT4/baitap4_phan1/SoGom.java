package BT4.baitap4_phan1;

import java.util.ArrayList;
import java.util.Random;

public class SoGom {
    public static int[] nhapSo(int soPhanTu) {
        Random random = new Random();
        int daySo[] = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            daySo[i] = random.nextInt(100);
        }
        return daySo;
    }

    public static void xuat(int[] daySo) {
        for (int i = 0; i < daySo.length; i++) {
            System.out.print(daySo[i] + " ");
        }
        System.out.println();
    }

    public static int[] soChiaHetChoBay(int[] daySo) {
        for (int i = 0; i < daySo.length; i++) {
            for (int j = 0; j < daySo.length - 1; j++) {
                int temp;
                if (daySo[i] % 7 == 0 && daySo[i] % 5 != 0) {
                    temp = daySo[i];
                    daySo[i] = daySo[j];
                    daySo[j] = temp;
                }
            }
        }
        return daySo;
    }

    public static int[] soChiaHetChoNam(int[] daySo) {
        for (int i = daySo.length - 1; i > 0; i--) {
            for (int j = i; j >= 0; j--) {
                int temp;
                if (daySo[j] % 5 == 0 && daySo[j] % 7 != 0) {
                    temp = daySo[j];
                    daySo[j] = daySo[i];
                    daySo[i] = temp;
                }
            }
        }
        return daySo;
    }


    public static void main(String[] args) {
        System.out.println("Dãy số nhập vào là:");
        int daySo[] = nhapSo(10);
        xuat(daySo);
        soChiaHetChoBay(daySo);
        soChiaHetChoNam(daySo);
        System.out.println("Kết quả sau khi sắp xếp là: ");
        xuat(daySo);
    }
}
