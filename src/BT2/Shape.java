package BT2;

public class Shape {
    private static void drawA(int n){
        for(int i=1;i <=n; i++){
            for (int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    private static void drawB(int n){
        for(int i=1;i <=n; i++){
            for (int j=n;j>=i;j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        drawA(8);
        System.out.println("====================");
        drawB(8);
    }}
