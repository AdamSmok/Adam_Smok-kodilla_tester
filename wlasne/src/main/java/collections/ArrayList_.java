package collections;

import java.util.ArrayList;

public class ArrayList_ {
    public static void main(String[] args) {

        Animal cat1 = new Animal("Rudy");
        Animal cat2 = new Animal("Bury");
        Animal cat3 = new Animal("Biały");

        ArrayList cats = new ArrayList();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        System.out.println("---------------");
        for(Object cat : cats){
            System.out.println(((Animal)cat).name);
        }
        System.out.println("---------------");
        System.out.println(((Animal)cats.get(0)).name);
        System.out.println(cats.size());
        System.out.println(cats.contains(cat2));
        cats.remove(cat2);
        cats.remove(1);
        cats.clear();
        System.out.println("---------------");
        for(Object cat : cats){
            System.out.println(((Animal)cat).name);
        }
        System.out.println("---------------");
    }
}
