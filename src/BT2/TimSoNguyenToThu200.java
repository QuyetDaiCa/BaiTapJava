package BT2;

//Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
public class TimSoNguyenToThu200 {
    static int kiemTraSoNguyenTo(int n){
        int dem =0;
        for (int i =1;i<=n;i++){
            if (n%i==0)
                dem++;
        }
        if (dem ==2) return 1;
        else return 0;

    }
    public static void main(String[] args) {
        int count =0;
        int i =2;
        while (count<200){
            if (kiemTraSoNguyenTo(i)==1){count++;}
            i++;
        }
        System.out.println("Số nguyên tố thứ " + count + " là "+ (i-1));
    }}

