package HW6.Q1;
import java.util.Comparator;
import java.text.Collator;
import java.util.Locale;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getName().compareTo(student2.getName())>0)
            return 1;
        else if(student1.getName().compareTo(student2.getName())<0)
            return -1;
        else
            return 0;
    }

//    public int compare (Student student1, Student student2) {
////        Collator collator = Collator.getInstance (new Locale ("cs"));
////
////        return (collator.compare (student1.getName (), student2.getName ()));
////    }
////}
}
