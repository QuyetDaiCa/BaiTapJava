package BT4.baitap4_phan3;

public class Shape {
    public static void triangle(int hang, int cot){
        int A[][] = new int[hang][cot];
        for (int i =0; i <hang;i++){
            for (int j = 0; j<=i; j++){
                if ((j==0) || (j ==i)){
                    A[i][j] = 1;
                    System.out.print(A[i][j]+ " ");
                }else {
                    A[i][j] = A[i-1][j-1]+A[i-1][j];
                    System.out.print(A[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(6,6);
}}
