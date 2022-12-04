package task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("Olena Іvanivna") ;
        list.add("Olga Serhiivna") ;
        list.add("Maksum Oleksandrovuch") ;
        list.add("Tetyana Phedorivna") ;
        list.add("Yana Іvanivna") ;
        list.add("Uriy Dmutrovuch") ;
        int theBest = list.indexOf("Tetyana Phedorivna");
        int notBest = list.indexOf("Olga Serhiivna");
        System.out.println("Індекс найкращого вчителя у списку становить: " + theBest );
        System.out.println("Індекс НЕнайкращого вчителя у списку становить: " + notBest );
        System.out.println(list );

    }
}
