package BT5.baitap5_phan1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
    public static int UCLN(int a, int b){
        if (a>b)
            return UCLN(a-b,b);
        if (a<b)
            return UCLN(b-a,a);
        return a;
    }
    public static int BCNN(int a , int b){
        return (a*b)/UCLN(a,b);
    }
    public static void nhapMang(List<Integer> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int n = scanner.nextInt();
        for (int i = 0; i< n;i++){
            list.add(Math.abs(scanner.nextInt()));
        }
    }
    public static int BCNNMang(List<Integer> list){
        int temp = BCNN(list.get(0),list.get(1));
        for (int i=2;i<list.size();i++){
            temp = BCNN(temp,list.get(i));
        }
        return temp;
    }
    public static int phanTuLonNhatThuHaiCuaMang(List<Integer> list){
        int maxThu1 = list.get(0);
        for (int i =1;i<list.size();i++){
            if (list.get(i)>maxThu1)
                maxThu1 = list.get(i);
        }
        int maxThu2 = list.get(0);
        for (int i =1;i<list.size();i++){
            if (list.get(i)>maxThu2 && list.get(i)<maxThu1)
                maxThu2 = list.get(i);
        }
            return maxThu2;
    }
    public static int Sum(List<Integer> list){
        return list.get(0)+list.get(list.size()-1);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        nhapMang(list);
        System.out.println("BCNN của mảng vừa nhập là ");
        System.out.println(BCNNMang(list));
        System.out.println("Tìm phần tử lớn nhất thứ 2 trong mảng");
        System.out.println(phanTuLonNhatThuHaiCuaMang(list));
        System.out.println("Tổng phần tử đầu và phần tử cuối của mảng");
        System.out.println(Sum(list));

    }
}
