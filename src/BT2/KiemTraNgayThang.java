package BT2;

import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào 1 tháng trong năm. Kiểm tra xem tháng đó có bao nhiêu ngày.
//Kiểm tra xem tháng đó có bao nhiêu ngày chủ nhật.
//Yêu cầu: Dữ liệu nhập vào hợp lệ. Tháng là 1 số nguyên dương từ 1 – 12. Nếu nhập sai xử lý nhập lại đến khi thành công.
public class KiemTraNgayThang {
    static int nhapThang(int month){
        Scanner scanner = new Scanner(System.in);
        while (month>12||month<=0){
            System.out.println("Mởi bạn nhập lại tháng nè!");
            month = scanner.nextInt();
        }
        return month;
    }
    static void kiemTraNgayCuaThang(int month,int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                if (kiemTraNamNhuan(year)==0)
                    System.out.println("Tháng " + month + " có 29 ngày");
                else  System.out.println("Tháng " + month + " có 28 ngày");
                break;
        }
    }
    //nếu nhuận return 0 ngược lại return 1
    static int kiemTraNamNhuan(int year){
        if (year%4==0){
            if (year%100==0){
                if (year%400==0)
                    return 0;
                else return 1;
            }else return 0;
        }return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập năm: ");
        int ktyear = scanner.nextInt();
        System.out.println("Mời bạn nhập tháng: ");
        int ktmonth = scanner.nextInt();
        int month =nhapThang(ktmonth);
        kiemTraNgayCuaThang(month,ktyear);
    }
}
