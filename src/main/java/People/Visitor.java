package People;

public class Visitor {
    private String name;
    private int age;
    private double height;
    private double money;


    public Visitor(String name, int age, double height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
