// Удалить из первого списка все элементы отсутствующие во втором списке.
package java_dz_3;

import java.util.ArrayList;

public class dz_3_9 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        arr.add("new");
        
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("world");

        arr.forEach(i -> System.out.println(i));
        System.out.println();
        arr2.forEach(i -> System.out.println(i));
        System.out.println("-----------");
        
        arr.retainAll(arr2);

        arr.forEach(i -> System.out.println(i));
        System.out.println();
        arr2.forEach(i -> System.out.println(i));
    }
    
}
