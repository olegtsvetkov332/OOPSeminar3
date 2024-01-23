import domain.Studen;
import domain.StudentGroup;
import domain.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        Studen student1 = new Studen("Евгений", 19);
        Studen student2 = new Studen("Василий", 20);
        Studen student3 = new Studen("Ольга", 19 );
        Studen student4 = new Studen("Анна", 25);
        Studen student5 = new Studen("Алексей", 19);
        Studen student6 = new Studen("Лариса", 23);

        //System.out.println(student1);
        //System.out.println(student2);
        //System.out.println(student3);

        List<Studen> list1 = new ArrayList<>();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        list1.add(student6);
        StudentGroup group1 = new StudentGroup(list1, 1);


        List<Studen> list2 = new ArrayList<>();
        list2.add(student6);
        list2.add(student5);
        list2.add(student4);
        list2.add(student3);
        list2.add(student2);
        list2.add(student1);
        StudentGroup group2 = new StudentGroup(list2, 2);


        // for (Studen student : group) {
        //     System.out.println(student);
        // }
        // System.out.println("_________________________________________________");
        // Collections.sort(group.getGroup());

        // for (Studen student : group) {
        //     System.out.println(student);
        // }

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        StudentSteam stream = new StudentSteam(groups, 1);
        System.out.println(stream);
    }

    
    
}
