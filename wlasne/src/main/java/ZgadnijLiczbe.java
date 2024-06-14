import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbe {
    public static void main(String[] args) {
        int i = 0;
        int los = 0;
        int odp = 0;

        Random rnd = new Random();
        los = rnd.nextInt(100) + 1;
        Scanner read = new Scanner(System.in);
        System.out.println("Zgadnij liczbę od 1 do 100");

        do{
            i++;
            System.out.println("Podaj liczbę: ");
            odp = read.nextInt();
            if(odp > los){
                System.out.println("Nie zgadłeś. Moja liczba jest mniejsza.");
            }else if(odp < los){
                System.out.println("Nie zgadłeś. Moja liczba jest większa.");
            }
        }while(odp != los);
        System.out.println("Brawo. Odgadłeś za " + i + " razem!");
    }
}
