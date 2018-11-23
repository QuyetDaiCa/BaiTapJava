package BT2;

import java.util.Random;
import java.util.Scanner;

//Viết chương trình mô phỏng trò chơi đoán số.
//Người chơi nhập vào một số, máy tạo ra ngẫu nhiên một số (từ 0-5). Mỗi lần đoán đúng được 2 điểm.
// Chương trình thực hiện liên tục cho đến khi người dùng nhấn phím kết thúc. Chương trình kết thúc phải xuất ra tổng điểm,
// điểm trung bình, bao nhiêu lần đoán, thống kê kết quả đoán trúng của người chơi.
public class TroChoiNgauNhien {
    static int diem = 0;
    static int count = 1;
    static int soLanDoanTrung = 0;
    static int soNguoiChoiNhap;
    static int soNgauNhienMay;
    static void troChoi(){

        Random random = new Random();

        while(true){
            System.out.println("Người dùng nhập lần thứ " + count);
            Scanner scanner = new Scanner(System.in);
            soNguoiChoiNhap = scanner.nextInt();
            if (soNguoiChoiNhap==0){
                break;
            }
            soNgauNhienMay = random.nextInt(6);
            count++;
            if (soNguoiChoiNhap==soNgauNhienMay){
                diem = diem + 2;
                System.out.println("Số điểm hiện tại của bạn là " + diem);
                soLanDoanTrung++;
            }
            if(soNguoiChoiNhap>6||soNguoiChoiNhap<0)
            {
                System.out.println("Số bạn nhập không thuộc vùng ngẩu nhiên của máy rồi mời bạn nhập lại!");
            }

        }
        System.out.println("Tổng điểm của người chơi là  " + diem);
        float dtb = (float)diem/count;
        System.out.println("Điểm trung bình của người chơi là " + dtb);
        System.out.println("Số lần đoán của người chơi la " + (count));
        System.out.println("Số lần đoán đúng của người chơi " + soLanDoanTrung);


    }
    public static void main(String[] args) {
        troChoi();
    }}

