public interface Database {


    void login();
    void add(String data);
    void  delete(int id);
    void  get(int id);
    void  update(int id ,String newData);

}
