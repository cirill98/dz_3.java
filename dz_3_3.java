// Вставить элемент в список в первой позиции.
package java_dz_3;


import java.util.ArrayList;

public class dz_3_3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        System.out.println(arr);
        arr.add(0, "Привет");
        System.out.println(arr);
    }
    
}
