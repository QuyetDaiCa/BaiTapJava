package BT4.baitap4_phan2;

public class ChucNang {
    public static void main(String[] args) {
        Students student1 = new Students(111, "Nguyễn Văn A", 5.5f, 6.5f);
        Students student2 = new Students(112, "Nguyễn Văn B", 6.7f, 8.5f);
        Students student3 = new Students();
        student3.nhap();
        student1.xuat();
        student2.xuat();
        student3.xuat();

    }
}
