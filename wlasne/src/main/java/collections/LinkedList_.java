package collections;

import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Poznań");
        list.add("Warszawa");
        list.add("Kraków");

        list.remove(0);
        for(String e : list){
            System.out.println(e);
        }
        list.clear();
    }
}
