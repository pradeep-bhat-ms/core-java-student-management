package StudentManagementSystem;


import java.util.ArrayList;

public class StudentService {




    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully");
    }

    // View Students
    public void viewStudents() {

        if(students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }

        for(Student s : students) {
            s.display();
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for(Student s : students) {

            if(s.getId() == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // Update Student
    public void updateStudent(int id, String name, double marks) {

        for(Student s : students) {

            if(s.getId() == id) {

                s.setName(name);
                s.setMarks(marks);

                System.out.println("Student Updated");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for(Student s : students) {

            if(s.getId() == id) {
                students.remove(s);
                System.out.println("Student Deleted");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}
