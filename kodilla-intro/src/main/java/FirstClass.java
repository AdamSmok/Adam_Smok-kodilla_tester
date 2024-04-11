public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 800, 2024);
        System.out.println("\nWaga: " + notebook.weight + " Cena: " + notebook.price + " Rocznik: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.rateNotebook();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
        System.out.println("\nWaga: " + heavyNotebook.weight + " Cena: " + heavyNotebook.price + " Rocznik: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.rateNotebook();

        Notebook oldNotebook = new Notebook(1600, 500, 2022);
        System.out.println("\nWaga: " + oldNotebook.weight + " Cena: " + oldNotebook.price + " Rocznik: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.rateNotebook();

    }
}