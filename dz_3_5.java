// Обновить определенный элемент списка по заданному индексу
package java_dz_3;

import java.util.ArrayList;

public class dz_3_5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        System.out.println(arr);
        arr.set(1, "nneww");
        System.out.println(arr);
    }
    
}
