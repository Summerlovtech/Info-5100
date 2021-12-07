package HW6.Q1;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Student> {

@Override
    public int compare(Student student1, Student student2) {
        int year1 = student1.getDateOfBirth().getYear();
        int year2 = student2.getDateOfBirth().getYear();

        int month1 = student1.getDateOfBirth().getMonth();
        int month2 = student2.getDateOfBirth().getMonth();

        int day1 = student1.getDateOfBirth().getDay();
        int day2 = student2.getDateOfBirth().getDay();

        if (year1 > year2){
            return 1;
        } else if (year1 < year2){
            return -1;
        }
        if (month1 > month2){
            return 1;
        } else if ( month1 < month2){
            return  -1;
        }
        if (day1 > day2){
            return 1;
        } else if(day1 < day2){
            return -1;
        }
        return 0;
    }
}

