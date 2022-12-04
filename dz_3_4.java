// Извлечь элемент (по указанному индексу) из заданного списка.
package java_dz_3;

import java.util.ArrayList;

public class dz_3_4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
    
}
