import terevez.Vegetable;

public class Garlic implements Vegetable {

    public  String name;
    public  int kg;

    public Garlic(String name, int kg) {
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
