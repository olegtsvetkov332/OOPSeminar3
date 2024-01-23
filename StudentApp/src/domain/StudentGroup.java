package domain;

import java.util.List;
import java.util.Iterator;

public class StudentGroup implements Iterable<Studen>, Comparable<StudentGroup> {

    private List<Studen> group;
    private int idGroup;
    

    
    public StudentGroup(List<Studen> list, int id) {
        this.group = list;
        this.idGroup = idGroup;
    }

    public List<Studen> getGroup() {
        return group;
    }

    public void setGroup(List<Studen> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "\nStudentGroup {\n" +
                " idGroup = " + idGroup +
                "\n StudensNumber = " + group.size() +
                "\n group = " + group +
                "\n }";
    }

    @Override
    public Iterator<Studen> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup g) {
        if(g.getGroup().size() > group.size()){
            return -1;
        }
        if(g.getGroup().size() < group.size()) {
            return 1;
        }
        if(g.getIdGroup() > idGroup) {
            return -1;
        }
        if(g.getIdGroup() < idGroup) {
            return 1;
        }

        return 0;
    }
    
}
