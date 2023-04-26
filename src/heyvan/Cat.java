package heyvan;

import heyvan.Animal;

public class Cat implements Animal {
    private String name;
    public  Cat( String name) {
        this.name= name;
    }

    @Override
    public void getName() {
        System.out.println("Pisik sinsila");
    }

    @Override
    public void makeNoise() {
        System.out.println("miyo miyo");
    }
}
