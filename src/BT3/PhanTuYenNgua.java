package BT3;

import java.util.Random;
import java.util.Scanner;

public class PhanTuYenNgua {
    static void nhapMang(int mangHaiChieu[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                Random random = new Random();
                mangHaiChieu[i][j] = 1 + random.nextInt(99);
            }
        }
    }

    static void xuatMang(int mangHaiChieu[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mangHaiChieu[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void YenNgua(int arr[][]) {
        int q = 0;
        int minHang=0;
        int maxCot=0;
        for (int i=0;i<5;i++){
            minHang = arr[i][0];
            for (int j=0;j<4;j++){
                if (minHang>arr[i][j])
                    minHang = arr[i][j];
                q = j;
            }
        }
        maxCot = minHang;
        for (int j=0;j<5;j++){
            if (maxCot<arr[j][q])
                maxCot = arr[j][q];
        }
        if (minHang==maxCot){
            System.out.println("Mảng có phần tử yên ngựa là " + maxCot);
        }else System.out.println("Không tồn tại phần tử yên ngựa trong mảng");
    }

    //phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần tử lớn nhất trong cột của nó.
    public static void main(String[] args) {
        int mangHaiChieu[][] = new int[5][4];
        nhapMang(mangHaiChieu);
        xuatMang(mangHaiChieu);
        YenNgua(mangHaiChieu);

    }
}