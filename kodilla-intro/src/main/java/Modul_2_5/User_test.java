package Modul_2_5;

public class User_test {
    public static void main(String[] args) {
        float average = 0.0F;
        int sumAge = 0;

        User[] users = new User[10];
        users[0] = new User("Geralt", 50);
        users[1] = new User("Yennefer", 90);
        users[2] = new User("Jaskier", 45);
        users[3] = new User("Tris", 70);
        users[4] = new User("Gandalf", 500);
        users[5] = new User("Thorin", 350);
        users[6] = new User("Frodo", 33);
        users[7] = new User("Golum", 300);
        users[8] = new User("Sauron", 900);
        users[9] = new User("Pippin", 32);

        //System.out.println(users[4].age);
        for (int i = 0; i < users.length; i++) {
            sumAge += users[i].age;
        }
        average = (float) sumAge / users.length;
        System.out.println("Sum: "+sumAge);
        System.out.println("AVG: "+average);
        for (int i = 0; i < users.length; i++) {
            if(users[i].age < average){
                System.out.println(users[i].name + " with age = " + users[i].age + " is younger than average.");
            }
        }

/*      //Ciekawi mnie różnica pomiędzy tablicami users i users2
        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users2 = {anna, betty, carl, david, eva, frankie};
        System.out.println(users2[1].age);*/


    }
}
