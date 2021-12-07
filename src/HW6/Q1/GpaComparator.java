package HW6.Q1;

import java.util.Comparator;


public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2)
    {
        if(student1.getGpa() > student2.getGpa())
            return -1;
        else if(student1.getGpa() < student2.getGpa())
            return 1;
        else
            return 0;
    }
}