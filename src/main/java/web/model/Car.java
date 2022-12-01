package web.model;

public class Car {
    String mark_id;
    int year;
    String color;

    public Car() {}

    public Car(String mark_id, int year, String color) {
        this.mark_id = mark_id;
        this.year = year;
        this.color = color;
    }

    public String getMark_id() {
        return mark_id;
    }

    public void setMark_id(String mark_id) {
        this.mark_id = mark_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark_id='" + mark_id + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}

