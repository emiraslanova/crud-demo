import terevez.Vegetable;

public class Tomato implements Vegetable {
    public String name ;
    public int kg ;

    public Tomato(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }

    @Override
    public String vegetableName() {

        return name ;
    }

    @Override
    public int receivedKg() {

        return kg;
    }

    @Override
    public int price() {

        return kg * 10;
    }
}
