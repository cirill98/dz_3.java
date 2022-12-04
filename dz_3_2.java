// Итерация всех элементов списка цветов и добавления к каждому символа '!'.
package java_dz_3;

import java.util.ArrayList;
import java.util.Iterator;


public class dz_3_2 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Зеленый");
        color.add("Синий");
        color.add("Красный");
        color.add("Черный");
        System.out.println(color);

        Iterator<String> iterator = color.iterator();
        while (iterator.hasNext()){
            String i = iterator.next();
            i += '!';
            System.out.println(i);
        }
    }    
}        
        
        
        // for (int i = 0; i < color.size(); i++){
        //     color.add("!");
        //     System.out.print(color);
        // }
        // System.out.print(Arrays.toString(color));   

    // for (ArrayList<String> i: color){
    //     i.add();
    // }
      
    
    // static void arr(ArrayList<String> c){
    //     for (int i = 0; i < c.size(); i++){
    //         System.out.println(i);
    //     }
    // }

