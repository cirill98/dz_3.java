// Удалить третий элемент из списка.
package java_dz_3;

import java.util.ArrayList;

public class dz_3_6 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        arr.add("new");
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
    }
    
}
