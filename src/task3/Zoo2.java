package task3;


import java.util.ArrayList;

public class Zoo2   {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() ;

        list .add(0,"Penguin");
        list .add(1,"Lion");
        list .add(2,"Wolf");
        list .add(3,"Fox");
        list .add(4,"Bear");
        list .add(5,"Swan");
        list .add(6,"Zebra");
        list .add(7,"Tiger");
        System.out.println("Початковий розмір списку: " + list.size() + " елементів");
        list.remove(7) ;
        list.remove(5) ;
        list.remove(3) ;
        System.out.println("Розмір списку після видалення 3, 5 та 7 елементів : " + list.size() + " елементів") ;
        System.out.println("Оновлений список: " + list );

    }

}
