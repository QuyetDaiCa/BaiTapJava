package BT4.baitap4_phan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    private int studentCode;
    private String studentName;
    private float diemLT;
    private float diemTH;

    public Students() {
    }

    public Students(int studentCode, String studentName, float diemLT, float diemTH) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTrungBinh(float diemLT, float diemTH) {
        return (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter code Student's is");
        int code = scanner.nextInt();
        setStudentCode(code);
        scanner.nextLine();
        System.out.println("Enter name Student's");
        String name = scanner.nextLine();
        setStudentName(name);
        System.out.println("Enter LT grade is ");
        float diemLT = scanner.nextFloat();
        setDiemLT(diemLT);
        System.out.println("Enter LT grade is ");
        float diemTH = scanner.nextFloat();
        setDiemTH(diemTH);
    }

    public void xuat() {
        float diemTrungBinh = tinhDiemTrungBinh(getDiemLT(), getDiemTH());
        System.out.print(getStudentCode() + "    " + getStudentName() + "     " +
                getDiemLT() + "   " + getDiemTH() + "    " + diemTrungBinh + "\n");
    }

}
