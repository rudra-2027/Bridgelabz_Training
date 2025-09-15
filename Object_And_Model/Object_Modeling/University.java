package Object_Modeling;
import java.util.ArrayList;
import java.util.List;
//Problem 2: University with Faculties and Departments (Composition and Aggregation)
//Description: Create a University with multiple Faculty members and Department objects. Model it so that the University and its Departments are in a composition relationship (deleting a university deletes all departments), and the Faculty members are in an aggregation relationship (faculty can exist outside of any specific department).
//Tasks:
//Define a University class with Department and Faculty classes.
//Demonstrate how deleting a University also deletes its Departments.
//Show that Faculty members can exist independently of a Department.
//Goal: Understand the differences between composition and aggregation in modeling complex hierarchical relationships.

class University {
    private String uniName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.uniName = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }
  
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

   
    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void display() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println( d.getDeptName());
        }
        System.out.println("Faculty Members:");
        for (Faculty f : faculties) {
            System.out.println(f.getName());
        }
    }
    public static void main(String[] args) {
        University uni = new University("GLA University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");

        Faculty Rohan = new Faculty("Rohan");
        Faculty Rahul = new Faculty("Rahul");

        uni.addFaculty(Rohan);
        uni.addFaculty(Rahul);

        uni.display();

               
    }
    class Department {
        private String deptName;

        public Department(String name) {
            this.deptName = name;
        }

        public String getDeptName() {
            return deptName;
        }
    }

  
    
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

