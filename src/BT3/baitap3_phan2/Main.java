package BT3.baitap3_phan2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle nguoidan1 = new Vehicle();
        Vehicle nguoidan2 = new Vehicle();
        Vehicle nguoidan3 = new Vehicle();
        nguoidan1.nhapThongTin();
        nguoidan2.nhapThongTin();
        nguoidan3.nhapThongTin();
        vehicle.xuatThongTin();
    }
}
