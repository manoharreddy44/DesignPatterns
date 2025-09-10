package OOPSConcepts.Aggregation;
import java.util.List;

class University {
    String name;
    List<Department> departments;

    University(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }
}
