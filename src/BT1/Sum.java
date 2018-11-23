package BT1;

import java.util.Scanner;

//Viết chương trình tính tổng các số nguyên chẵn từ 1 đến N.
//Với N được nhập từ bàn phím (N>0). Nếu N < 0 thông báo lỗi và yêu cầu nhập lại.
public class Sum {
    static int sum(int n){
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        if(n<0)
            System.out.println("Bạn nhập sai rồi xin bạn nhập lại: ");
        n = scanner.nextInt();
        for(int i =1;i<=n;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập: ");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
}

