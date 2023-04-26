import heyvan.Cat;
import heyvan.Dog;
import program.ProgrammingLanguage;
import terevez.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.4);
        circle.getArea();
        System.out.println(circle.getArea());


        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.getName();
        Dog dog = new Dog("Cek");
        dog.getName();
        dog.makeNoise();
        Cat cat = new Cat("Pamuk");
        cat.getName();
        cat.makeNoise();





        //    Scanner sc = new Scanner(System.in);
        //    Vegetable vegetable = null;
        //   System.out.println("Reqemi daxil edin ");


        //    int Vegetable = sc.nextInt();

        //    switch (Vegetable ){


        //    case 1:
        //       System.out.println("Onion "+ " 2 kq" + "10 azn ");
        //         break;
        //     case 2:
        //        System.out.println("Garlic" + "  1 kq " + "5 azn");
        //        break;
        //
        //    case 3:
        //      System.out.println("" + "Tomato :"  +"  3kq " + "7 azn");
        //      break;
        //       default:
        //      System.out.println("Yoxdur");
        //    break;


    Database database = new Mysql();
        database.login();
        database.add("Melumat");
        database.delete(2);
        database.get(1);
        System.out.println("Melumatlari gir ");
        database.update(1,"Mysql");
    boolean Database;
        System.out.println("Database");
    Database database1 = new Oracle();
        database1.login();
        database1.add("Oracle elave et");
        database1.delete(1);
        database1.get(3);
        System.out.println("Melumatlari sil");
        database1.update(3,"Yenile");

}

}




