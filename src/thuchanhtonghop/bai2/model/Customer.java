package thuchanhtonghop.bai2.model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private int homeNumber;
    private int idElectric;

    public Customer() {
    }

    public Customer(String name, int homeNumber, int idElectric) {
        this.name = name;
        this.homeNumber = homeNumber;
        this.idElectric = idElectric;
    }

    public String getName() {
        return name;
    }


    public int getIdElectric() {
        return idElectric;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", homeNumber=" + homeNumber +
                ", idElectric=" + idElectric;
    }
}
