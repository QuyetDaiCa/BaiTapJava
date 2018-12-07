package BT5;

import java.util.ArrayList;
import java.util.List;

public class TapTruyenTranh {
    public static void showList(List<String> list){
        for (String obj:list){
            System.out.print(obj+" " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("Quyết");
        listA.add("Cường");
        List<String> listB = new ArrayList<>();
        listB.add("Huy");
        listB.add("Nhân");
        List<String> listC = new ArrayList<>();
        listC.add("Quyết");
        listC.add("Huy");
        listC.add("Nhân");
        System.out.println("Danh sách list A" );
        showList(listA);
        System.out.println("Danh sách list B" );
        showList(listB);
        System.out.println("AddAll:");
        listA.addAll(listB);
        showList(listA);
        System.out.println("RetailAll:");
        listA.retainAll(listB);
        showList(listA);
        System.out.println("RemoveAll:");
        listC.removeAll(listA);
        showList(listC);
}}
