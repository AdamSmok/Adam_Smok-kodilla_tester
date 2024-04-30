public class Switch {
    public static void main(String[] args) {
        String danie = "Losos";

        switch(danie){
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Losos":
                System.out.println("Cena to 35 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Nie mamy takiego dania");
        }
    }
}
