package HW6.Q1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Student> list = new ArrayList<>();

    public static void main(String[] args) {

        Main main = new Main();

        main.fillArray();

        System.out.println("Sort by Gpa:");
        main.sortGpa();
        main.showSort();

        System.out.println("Sort by Name:");
        main.sortName();
        main.showSort();

        System.out.println("Sort by Birthday:");
        main.sortBirthday();
        main.showSort();
    }

    private void fillArray() {
        list.add(new Student(210901, "Jenny", 3.5, new Date(1998, 1, 3)));
        list.add(new Student(210902, "Sam", 3.3, new Date(1992, 8, 13)));
        list.add(new Student(210903, "Aaron", 3.8, new Date(1998, 1, 4)));
        list.add (new Student (210904,"Sara", 3.7, new Date(1998, 1, 4)));
        list.add (new Student (210905,"Mark", 2.9, new Date(1995, 11, 20)));
        list.add (new Student (210906,"Vivian", 4.0, new Date(1992, 10, 11)));
        list.add (new Student (210907,"Mary", 3.0, new Date(2000, 3, 11)));
    }

    public void sortGpa() {
        list.sort(new GpaComparator()); // Comparator() is an interface. We need to new a GpaComparator();
    }

    public void sortName() {
        list.sort(new NameComparator());
    }

    public void sortBirthday() {
        list.sort(new DateOfBirthComparator());
    }

    public void showSort(){
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName() + " " + student.getId() + " " + student.getGpa() + " " + student.getDateOfBirth().toString());
        }
    }
}
