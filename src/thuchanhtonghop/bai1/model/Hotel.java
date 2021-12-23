package thuchanhtonghop.bai1.model;

import java.time.LocalDate;

public class Hotel {
    private LocalDate startDate;
    private String kindOfRoom;
    private double price;
    private Human human;

    public Hotel() {
    }

    public Hotel(LocalDate startDate, String kindOfRoom, double price, Human human) {
        this.startDate = startDate;
        this.kindOfRoom = kindOfRoom;
        this.price = price;
        this.human = human;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "startDate=" + startDate +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", price=" + price +
                ", human=" + human.toString() +
                '}';
    }
}
