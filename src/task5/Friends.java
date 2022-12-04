package task5;

import java.util.*;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("Oly") ;
        list.add("Katya") ;
        list.add("Nata") ;
        list.add("Slava") ;
        list.add("Tanya") ;
        list.add("Gnat") ;
        System.out.println("До сортування: " + list );
        Collections.sort(list );
        System.out.println("Після сортування: " + list );

    }
}
