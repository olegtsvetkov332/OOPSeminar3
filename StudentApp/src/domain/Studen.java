package domain;

public class Studen extends Persone implements Comparable<Studen> {

    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static int generalId;

    public Studen(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }


    
    @Override
    public String toString() {
        return "Student{" + "id" + id + "}" + super.toString();
    }

    @Override
    public int compareTo(Studen o) {
        // TODO Auto-generated method stub
        System.out.println(super.getName() + "-" + o.getName());
        if (o.getAge() > super.getAge()) {
            return -1;
        }
        if (o.getAge() < super.getAge()) {
            return 1;
        }
        if (o.getId() > id) {
            return -1;
        }
        if (o.getId() < id) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
