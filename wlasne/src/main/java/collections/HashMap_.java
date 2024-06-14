package collections;

import java.util.HashMap;

public class HashMap_ {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Poniedziałek");
        map.put(5,"Piątek");
        map.put(7,"Niedziela");

        System.out.println(map.get(5));
        for(String e : map.values()){
            System.out.println(e);
        }
    }
}
