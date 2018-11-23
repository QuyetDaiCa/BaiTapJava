package BT1;

import java.util.Scanner;

//Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình theo thứ tự tăng dần và chỉ dùng tối đa một biến phụ
public class SortAZ {
    public static void Sort(int a, int b, int c){
        if(a>b){
            int temp =a;//trong java khong có tham tri
            a=b;//khi thoat ra khoi mot ham thi gia tri ban dau khong thay doi
            b=temp;//gia tri bien chi thay doi trong ham
        }//muon thay doi dung get set
        if (b>c){
            int temp = b;
            b = c;
            c = temp;
        }
        if (a>c){
            int temp = c;
            c = a;
            a = temp;
        }
        System.out.println(a+" "+b+" "+ " "+ c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        Sort(a,b,c);
    }
}
