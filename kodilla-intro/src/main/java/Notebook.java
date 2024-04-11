public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price,int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }


    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        } else {
            System.out.println("The price is good.");
        }
    }

    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 1500) {
            System.out.println("This notebook is very heavy.");
        } else {
            System.out.println("This notebook is slightly heavy.");
        }
    }

    public void rateNotebook() {
        if (this.price > 1200 && this.year <= 2023) {
            System.out.println(this.price + " is too much for a notebook made in " + this.year);
        } else if (this.price < 900 && this.year > 2023) {
            System.out.println("It is a good deal to pay " + this.price + " for a notebook not older then from " + this.year);
        } else {
            System.out.println("Consult with specialist, provide info: " + this.price + " for a notebook made in " + this.year);
        }
    }
}