package BT1;

import java.util.Scanner;

//Viết chương trình nhập vào 3 số nguyên từ bàn phím. Tìm số nhỏ nhất lớn nhất và in ra.
public class Min_Max_Number {
    public static int min(int a, int b, int c) {
        int min;
        if(a<=b){
            if(a<=c){
                min =a;
            }else min = c;
        }else {
            if (b<=c){
                min = b;
            }else min = c;
        }
        return min;
    }
    public static int max(int a, int b, int c){
        int max;
        if(a>=b){
            if(a>=c){
                max =a;
            }else max = c;
        }else {
            if(b>=c){
                max =b;
            }else max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        System.out.println("Số nhỏ nhất trong ba số là: ");
        System.out.println(min(a,b,c));
        System.out.println("Số lớn nhất trong ba số là: ");
        System.out.println(max(a,b,c));
    }
}

