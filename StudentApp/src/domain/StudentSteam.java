package domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    
    private Integer idStream;

    public List<StudentGroup> getStream() {
        return stream;
    }

    public List<StudentGroup> stream;
    public StudentSteam(List<StudentGroup> stream, Integer idStream) {
        this.idStream = idStream;
        this. stream = stream;
    }

    @Override
    public String toString() {
        return "StudentSteam {" +
        "\n id Stream = " + idStream +
        "\n groupNumber = " + stream.size() +
        "\n stream = " +stream +
        "\n";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(stream);
    }
    

}
