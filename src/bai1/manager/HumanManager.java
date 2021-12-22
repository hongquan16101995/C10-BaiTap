package bai1.manager;

import bai1.model.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Human> humans;

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public Human createHuman() {
        System.out.println("Nhập vào tên người: ");
        String name = scanner.next();
        System.out.println("Nhập vào ngày tháng năm sinh: ");
        String dob = scanner.next();
        System.out.println("Nhập vào số idCard: ");
        String idCard = scanner.next();
        for (Human h : humans) {
            if (h.getIdCard().equals(idCard)) {
                System.out.println("Trùng số idCard, nhập lại!");
                return null;
            }
        }
        Human human = new Human(name, dob, idCard);
        humans.add(human);
        return human;
    }

    public void deleteHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (h.getIdCard().equals(idCard)) {
                human = h;
            }
        }
        boolean check = humans.remove(human);
        if (check) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Xóa không thành công!");
        }
    }

    public void displayHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (h.getIdCard().equals(idCard)) {
                human = h;
            }
        }
        if (human != null) {
            System.out.println(human);
        } else {
            System.out.println("Số idCard không tồn tại!");
        }
    }

    public void displayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public Human getHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (h.getIdCard().equals(idCard)) {
                human = h;
            }
        }
        return human;
    }
}
