// Поиска элемента в списке по строке.
package java_dz_3;

import java.util.ArrayList;

public class dz_3_7 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        arr.add("new");
        System.out.println(arr);
        int a = arr.indexOf("new");
        System.out.println(a);
    }
    
}
