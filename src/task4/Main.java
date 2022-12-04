package task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0, 5) ;
        list.add(1, 7) ;
        list.add(2, 9) ;
        list.add(3, 11) ;
        list.add(4, 13) ;
        list.add(5, 15) ;
        System.out.println(list );
        ListIterator <Integer > listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Integer integer = listIterator.next() +1;
            System.out.print(integer + " ");
        }



    }
}
