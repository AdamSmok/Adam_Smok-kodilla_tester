package Modul_2_6;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", 40.5, 178);
        Person person2 = new Person("Jurek", 16, 140);
        Person person3 = new Person("Kaśka", 31, 162);
        person1.checkPerson();
        person2.checkPerson();
        person3.checkPerson();
    }
}