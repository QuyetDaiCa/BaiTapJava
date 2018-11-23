package BT1;

public class TongGiaiThua {
    static long giaiThua(int n){
        if(n<=1){
            return 1;
        }
        return  n*giaiThua(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Tổng S = 4! +7! + 12! + 18!");
        long sum =giaiThua(4) +giaiThua(7)+giaiThua(12)+giaiThua(18);
        System.out.println("Tổng = "+sum);
    }
}
