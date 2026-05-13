import java.util.*;
import java.util.List;
import java.util.Objects;

public class ComparatorClass {

    
    static class Student {
        private String name;
        private int rollno;

        public Student(String name, int rollno) {
            this.name = name;
            this.rollno = rollno;
        }

        public String getName() {
            return name;
        }

        public int getRollno() {
            return rollno;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, rollno);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;

            Student other = (Student) obj;
            return Objects.equals(name, other.name) &&
                   rollno == other.rollno;
        }

        @Override
        public String toString() {
            return name + " - " + rollno;
        }
    }

   
    static class RollnoComp implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getRollno(), o2.getRollno());
        }
    }

 
    static class NameComp implements Comparator<Student> {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }

   
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Sakshi", 3));
        list.add(new Student("Mohit", 1));
        list.add(new Student("Priyanshi", 2));

        System.out.println("Sort by Roll No:");
        Collections.sort(list, new RollnoComp());
        System.out.println(list);

        System.out.println("\nSort by Name:");
        Collections.sort(list, new NameComp());
        System.out.println(list);
    }
}