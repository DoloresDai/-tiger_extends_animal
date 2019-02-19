package java.company;

import main.java.company.model.Animal;
import main.java.company.model.Tiger;

public class TigerDemo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(2,20.2);
        tiger.basicAttributes(tiger);
        tiger.meow();
    }
}
