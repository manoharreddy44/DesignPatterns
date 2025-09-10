package OOPSConcepts.Aggregation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department("CS");
        Department d2 = new Department("Math");

        University uni = new University("MIT", Arrays.asList(d1, d2));

        System.out.println("University: " + uni.name);
        for (Department d : uni.departments) {
            System.out.println("- Department: " + d.name);
        }
    }
}
