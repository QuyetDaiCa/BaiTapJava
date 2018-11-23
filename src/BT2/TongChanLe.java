package BT2;

import java.util.Scanner;

//Viết chương trình nhập vào một số nguyên dương n < 11. Nếu n chẵn tính S = 0! + 2! +…+n! Nếu n lẻ S= 1! + 3! +…+n!
public class TongChanLe {
    static int giaiThua(int n){
        if(n<=1){
            return 1;
        }
        return  n*giaiThua(n-1);
    }
    static int sum(int n) {
        int sum = 0;
        for(int i =n;i>=0;i-=2){
            sum = sum + giaiThua(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("So các số nguyên nhập từ bàn phím: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n>=11||n<0)
        {
            System.out.println("Mời bạn nhập lại: ");
            n = scanner.nextInt();
        }
        int sum = sum(n);
        System.out.println(sum);
    }
}

