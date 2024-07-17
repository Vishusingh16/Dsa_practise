package Oops;

class Account {

    private String password;
    protected String name;
    public int age;

    public String getPassword() {

        return this.password;

    }

    public void setPassword(String pass) {
        this.password = pass;

    }

}

public class Access {
    public static void main(String[] args) {
        Account a = new Account();
        a.name = "Vaishnav Singh";
        a.age = 20;
        a.setPassword("1234");
        System.out.println(a.getPassword());
    }

}
