import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<student> {
    int marks;
    int age;
    String name;

    public student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;

    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return " " + marks + " - " + age + " - " + name;
    }

    @Override
    public int compareTo(student a) {
        if (this.age > this.age) {
            return 1;
        } else {
            return -1;
        }

    }

}

// class alpha implements Comparator<student> {
// public int compare(student a, student b) {
// if (a.age > b.age) {
// return 1;
// } else {
// return -1;
// }

// }

// }

public class Comparable_vs_Comparator05 {
    public static void main(String[] args) {
        student st1 = new student(98, 28, " Ishita ");
        student st2 = new student(96, 28, " Anshika ");
        student st3 = new student(18, 16, " Himanshu ");

        List<student> list = new ArrayList<student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(list);

        // Collections.sort(list); --> shows error
        // alpha alp = new alpha()
        // Collections.sort(list, alp)
        // Comparator<student> com = (student a , student b )->{
        // if (a.age > b.age) {
        // return 1;
        // } else {
        // return -1;
        // }

        // };

        // Collections.sort(list, com);

        Collections.sort(list);
        System.out.println(list);

    }

}
