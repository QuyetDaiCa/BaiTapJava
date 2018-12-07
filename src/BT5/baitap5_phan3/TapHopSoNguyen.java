package BT5.baitap5_phan3;

import java.util.HashSet;
import java.util.TreeSet;
public class TapHopSoNguyen {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        HashSet hashSet = new HashSet();
        treeSet.add("a");
        treeSet.add("c");
        treeSet.add("e");
        treeSet.add("d");
        hashSet.add("a");
        hashSet.add("e");
        hashSet.add("h");
        hashSet.add("b");
        hashSet.add("b");
        System.out.println("HashSet:");
        System.out.println(hashSet);
        System.out.println("TreeSet:");
        System.out.println(treeSet);
        System.out.println("addAll");
        treeSet.addAll(hashSet);
        System.out.println(treeSet);
        System.out.println("retainAll");
        treeSet.retainAll(hashSet);
        System.out.println(treeSet);
        System.out.println("removeAll");
        treeSet.removeAll(hashSet);
        System.out.println(treeSet);
    }
}
