package thuchanhtonghop.bai1.model;

public class Human {
    private String name;
    private String date;
    private String idCard;

    public Human() {
    }

    public Human(String name, String date, String idCard) {
        this.name = name;
        this.date = date;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
