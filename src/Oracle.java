public class Oracle implements Database {


    @Override
    public void login() {
        System.out.println("Oracle giris ");
    }

    @Override
    public void add(String data) {
        System.out.println("Oracle elave edin:");

    }

    @Override
    public void delete(int id) {
        System.out.println("Oracle silin"+ id);

    }

    @Override
    public void get(int id) {
        System.out.println("Oracle id almaq:");

    }

    @Override
    public void update(int id, String newData) {
        System.out.println("Oracle yenilemek:");

    }
}





