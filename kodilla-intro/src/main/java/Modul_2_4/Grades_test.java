package Modul_2_4;

public class Grades_test {
    public static void main(String[] args) {
        Grades student1 = new Grades();
        student1.add(3);
        student1.add(2);
        student1.add(5);
        student1.add(2);
        student1.add(3);
        student1.add(2);
        student1.add(4);
        student1.add(5);
        student1.add(6);
        student1.add(4);
        //Zgodnie z treścią zadania następne oceny powinny być ignorowane
        student1.add(6);
        student1.add(1);

        System.out.println("Ostatnia ocena: " + student1.lastScore());
        System.out.println("Średnia ocen  : " + student1.avg());
    }
}
