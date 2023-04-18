package bai2;

public abstract class Phone {
    public String name;
    public String phone;
    public Phone () {
        
    }
    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
