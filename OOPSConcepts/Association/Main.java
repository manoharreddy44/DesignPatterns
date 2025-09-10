package OOPSConcepts.Association;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. John");
        Student s = new Student("Alice");

        // Association
        System.out.println(s.name + " is taught by " + t.name);
    }
}
