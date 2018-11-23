package BT1;

public class HoanDoi {
    static void swap(int a, int b){
        a = a+b;//a=tong=a+b;
        b=a-b;//b=tong-b=a
        a=a-b;//a=tong-a

    }

    public static void main(String[] args) {
        int a=4;
        int b =3;
        swap(a,b);
        System.out.println(a+ " "+ b);
    }
}
