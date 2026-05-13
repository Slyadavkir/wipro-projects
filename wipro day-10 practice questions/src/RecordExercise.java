

public class RecordExercise {

    public static void main(String[] args) {

        Person s1 = new Person("Abhinav", 112, 98.50);
        Person s2 = new Person("Smita", 102, 99.50);
        Person s3 = new Person("Naman", 132, 98.50);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}


record Person(String name, int rollno, double marks) {

    void printDetails() {
        System.out.println("""
Person Details
-------------------
Name : %s
RollNo : %d
Marks : %.2f
-------------------
""".formatted(name, rollno, marks));
    }
}