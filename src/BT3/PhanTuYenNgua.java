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
        int kt = 0;
        int minhang[] = new int[10];
        int maxcot[] = new int[10];
        for (int i = 0; i < 5; i++) {
            minhang[i] = arr[i][0];
            for (int j = 0; j < 4; j++) {
                if (minhang[i] > arr[i][j]) {
                    minhang[i] = arr[i][j];
                }
            }
        }

        for (int j = 0; j < 4; j++) {
            maxcot[j] = arr[0][j];
            for (int i = 0; i < 5; i++) {
                if (maxcot[j] < arr[i][j]) {
                    maxcot[j] = arr[i][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if ((arr[i][j] == minhang[i]) && (arr[i][j] == maxcot[j])) {
                    System.out.println("Yen ngua = " + arr[i][j]);
                    kt++;
                }
            }
        }
        if (kt == 0) System.out.println("Không tồn tại phần tử yên ngựa ");
    }

    //phần tử yên ngựa nếu nó là phần tử nhỏ nhất trong hàng của nó đồng thời là phần tử lớn nhất trong cột của nó.
    public static void main(String[] args) {
        int mangHaiChieu[][] = new int[5][4];
        nhapMang(mangHaiChieu);
        xuatMang(mangHaiChieu);
        YenNgua(mangHaiChieu);

    }
}