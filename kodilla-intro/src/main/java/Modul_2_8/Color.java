package Modul_2_8;

public class Color {

    public static void main(String[] args) {
        String letter = UserDialog.getFirstLetter();
        System.out.println("Kolor ma sie zaczynać na: " + letter);
        AllColors[] myColors = AllColors.values();

        for (int i = 0; i < myColors.length; i++) {
            if (letter.toLowerCase().trim().equals(myColors[i].name.toLowerCase().trim())) {
                switch (letter) {
                    case "w":
                        System.out.println(myColors[i].name());
                        break;
                    case "b":
                        System.out.println(myColors[i].name());
                        break;
                    case "g":
                        System.out.println(myColors[i].name());
                        break;
                    case "r":
                        System.out.println(myColors[i].name());
                        break;
                    default:
                        System.out.println("Zły wybór!");
                }
            }
        }
    }
}


