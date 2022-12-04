// Создать новый список и добавить в него несколько елементов первого списка.
package java_dz_3;

import java.util.ArrayList;

public class dz_3_8 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("new");
        arr.add("world");
        arr.add("new");
        
        String c = arr.remove(1);
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add(c);   
        
        
        arr2.forEach(i -> System.out.println(i));
    }
    
}
