public class Mysql implements Database {
    @Override
    public void login() {
        System.out.println("Sql-a giris");

    }

    @Override
    public void add(String data) {
        System.out.println("Mysql elave et: "+ data);

    }

    @Override
    public void delete(int id) {
        System.out.println("Mysql silin:"+id);


    }

    @Override
    public void get(int id) {
        System.out.println("Mysql almaq:");


    }

    @Override
    public void update(int id, String newData) {
        System.out.println("Mysql yenileyin:");

    }
}