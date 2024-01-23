package domain;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Studen> {

    private int count;
    private List<Studen> list;

    public StudentIterator(List<Studen> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        return count < list.size();
    }

    @Override
    public Studen next() {
        // TODO Auto-generated method stub
        int index = count;
        count++;
        return list.get(index);
        
    }


    
}
