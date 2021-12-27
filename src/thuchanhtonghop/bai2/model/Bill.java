package thuchanhtonghop.bai2.model;

import java.io.Serializable;

public class Bill extends Customer implements Serializable {
    private int oldIndex;
    private int newIndex;

    public Bill() {
    }

    public Bill(String name, int homeNumber, int idElectric, int oldIndex, int newIndex) {
        super(name, homeNumber, idElectric);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getElectricBill() {
        return (newIndex - oldIndex) * 750;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
