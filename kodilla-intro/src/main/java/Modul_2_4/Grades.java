package Modul_2_4;

public class Grades {
    private int[] grades;
    private int size = 0;
    private int sum = 0;
    private float average = 0.0F;

    public Grades() {
        this.grades = new int[10];
    }

    public void add(int score) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = score;
        this.size++;
    }

    public int lastScore() {
        return this.grades[this.size - 1];
    }

    public float avg() {
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        average = (float) sum / size;
        return average;
    }
}
