package BT2;

import java.util.Scanner;

//Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số 2
public class DoiCoSoMuoiSangHai {
    static long chuyenDoi(int number){
        long result = 0;//result có nằm trong vòng lặp while được không?
        while (number>=1) {
            long rem = number % 2;
            result = result * 10 + rem;
            number = number/2;
        }
        return result;
    }
    static long soDao(long n){
        long soDaoNguoc =0;
        while(n>0){
            long rem = n%10;//lấy số cuối
            soDaoNguoc = soDaoNguoc*10 + rem;//lấy số đảo ngược
            n=n/10;//xóa số đảo
        }
        return soDaoNguoc;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ cơ số 10 ");
        int n = scanner.nextInt();
        System.out.println("Hệ cơ số hai của " + n + " là " + soDao(chuyenDoi(n)));
    }
}

