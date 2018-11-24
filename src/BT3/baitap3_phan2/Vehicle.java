package BT3.baitap3_phan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    private String tenChuXe;
    private int dungTich;
    private double thuePhaiNop;
    private double triGia;
    private String loaiXe;

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, int dungTich, double thuePhaiNop, double triGia, String loaiXe) {
        this.tenChuXe = tenChuXe;
        this.dungTich = dungTich;
        this.thuePhaiNop = thuePhaiNop;
        this.triGia = triGia;
        this.loaiXe = loaiXe;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getThuePhaiNop() {
        return thuePhaiNop;
    }

    public void setThuePhaiNop(double thuePhaiNop) {
        this.thuePhaiNop = thuePhaiNop;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public static ArrayList<Vehicle> arrVehicle = new ArrayList<Vehicle>();

    public void nhapThongTin() {
        // nhập

        Scanner scanner = new Scanner(System.in);
        // Vehicle vehicle = new Vehicle();-> đặt ngoài vòng for thì mảng chỉ lưu được giá trị cuối cùng
        for (int i = 0; i < 2; i++) {
            Vehicle vehicle = new Vehicle();
            System.out.println("Nhập tên chủ xe");
            String tenChuXe = scanner.nextLine();
            vehicle.setTenChuXe(tenChuXe);
            System.out.println("Nhập loại xe");
            String loaiXe = scanner.nextLine();
            vehicle.setLoaiXe(loaiXe);
            System.out.println("Nhập dung tích xe");
            int dungTich = scanner.nextInt();
            vehicle.setDungTich(dungTich);
            System.out.println("Nhập giá xe");
            double triGia = scanner.nextDouble();
            scanner.nextLine();
            vehicle.setTriGia(triGia);
            double thuePhaiNop = 0;
            if (dungTich > 100)
                thuePhaiNop = (long) (0.1 * triGia);
            if (100 <= dungTich && dungTich <= 200)
                thuePhaiNop = (0.3 * triGia);
            if (dungTich > 200)
                thuePhaiNop = (0.5 * triGia);
            vehicle.setThuePhaiNop(thuePhaiNop);
            arrVehicle.add(vehicle);
        }

    }

    public void xuatThongTin() {
        System.out.print("Tên chủ xe" + "            " + "Loại xe" + "          " +
                "Dung tích                 " + "Trị Giá                  " + "Thuế phải nộp" + "\n");
        System.out.printf("===========================================================================================================");
        System.out.println();
        for (int i = 0; i < arrVehicle.size(); i++) {
            String triGiaString = Double.toString(arrVehicle.get(i).getTriGia());
            System.out.print(arrVehicle.get(i).getTenChuXe() + "    " +
                    arrVehicle.get(i).getLoaiXe() + "        " + arrVehicle.get(i).getDungTich()
                    + "                   " + triGiaString +
                    "                    " + arrVehicle.get(i).getThuePhaiNop());
            System.out.println();
        }
        System.out.println("Nhấn enter để thoát chương trình.");
        Scanner scanner = new Scanner(System.in);
        String exit = scanner.nextLine();
        if (exit == " ") {
            System.exit(0);

        }
        ;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tenChuXe='" + tenChuXe + '\'' +
                ", dungTich=" + dungTich +
                ", thuePhaiNop=" + thuePhaiNop +
                ", triGia=" + triGia +
                ", loaiXe='" + loaiXe + '\'' +
                '}';
    }
}
