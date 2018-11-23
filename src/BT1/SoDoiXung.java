package BT1;

public class SoDoiXung {
    static int soDao(int n){
        int soDaoNguoc =0;
        while(n>0){
            int rem = n%10;//lấy số cuối
            soDaoNguoc = soDaoNguoc*10 + rem;//lấy số đảo ngược
            n=n/10;//xóa số đảo
        }
        return soDaoNguoc;
    }
    static void soDoiXung(int n){
        if (n==soDao(n)){
            System.out.println(n+" là số đối xứng.");
        }else {
            System.out.println(n+" không phải là số đối xứng.");
        }
    }

    public static void main(String[] args) {
        soDoiXung(131);
    }
}
