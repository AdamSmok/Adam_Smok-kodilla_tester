package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name = null;
    private double height = 0;
    private double width = 0;
    private boolean isMarked = false;

    public Stamp(String name, double height, double width, boolean isMarked) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.isMarked = isMarked;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isMarked() {
        return isMarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(height, stamp.height) == 0 && Double.compare(width, stamp.width) == 0 && isMarked == stamp.isMarked && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, isMarked);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", isMarked=" + isMarked +
                '}';
    }
}