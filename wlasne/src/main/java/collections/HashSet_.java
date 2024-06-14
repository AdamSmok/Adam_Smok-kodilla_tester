package collections;

import java.util.HashSet;
// mozna zamienic na LikedHashSet i wtedy pamieta kolejnosc elementow
public class HashSet_ {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Warszawa");
        set.add("Poznań");
        set.add("Szczecin");
        set.add("Szczecin");//nie ma duplikatów

        System.out.println("----------------");
        for(String e : set){
            System.out.println(e);
        }
    }
}
