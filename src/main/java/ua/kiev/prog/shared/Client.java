package ua.kiev.prog.shared;

public class Client {
    @Id
    private int id;

    private String name;
    private int age;

    private long balance;

    public Client() {
    }

    public Client(String name, int age, long balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", balance="+ balance +
                '}';
    }
}
