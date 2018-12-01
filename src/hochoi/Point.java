package hochoi;

import java.util.Scanner;

public class Point {
    private int hoanhDo;
    private int tungTo;

    public Point() {
    }

    public Point(int hoanhDo, int tungTo) {
        this.hoanhDo = hoanhDo;
        this.tungTo = tungTo;
    }

    public int getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public int getTungTo() {
        return tungTo;
    }

    public void setTungTo(int tungTo) {
        this.tungTo = tungTo;
    }
    void nhapToaDoDiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hoành độ");
        setHoanhDo(scanner.nextInt());
        System.out.println("Nhập tung độ");
        setTungTo(scanner.nextInt());
    }
}
