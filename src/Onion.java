import terevez.Vegetable;

public class Onion implements Vegetable {
    public String name;
    public int kg;

    public Onion(String name, int kg) {
        this.name = name;
        this.kg = kg;
    }

    @Override
    public String vegetableName() {

        return name;
    }

    @Override
    public int receivedKg() {

        return kg;
    }

    @Override
    public int price() {

        return kg * 8;

    }
}
