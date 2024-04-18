public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 800, 2024);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2023);
        Notebook oldNotebook = new Notebook(1600, 500, 2022);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println("\nWaga: " + notebook.weight + " Cena: " + notebook.price + " Rocznik: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.rateNotebook();
    }
}