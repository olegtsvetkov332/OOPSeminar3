package domain;

public abstract class Persone {
    
    private String name;
    private int age;


    public Persone(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Persone{" + "name=" + name + ", age=" + age + "}";
    }
    
}