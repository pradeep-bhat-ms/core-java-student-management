package StudentManagementSystem;
import java.util.Scanner;
public class Main {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        StudentService service = new StudentService();

	        while(true) {

	            System.out.println("\n STUDENT MANAGEMENT SYSTEM");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Update Student");
	            System.out.println("5. Delete Student");
	            System.out.println("6. Exit");

	            System.out.print("Enter Choice : ");
	            int choice = sc.nextInt();

	            switch(choice) {

	                case 1:

	                    System.out.print("Enter ID : ");
	                    int id = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Enter Name : ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Marks : ");
	                    double marks = sc.nextDouble();

	                    Student s = new Student(id, name, marks);

	                    service.addStudent(s);
	                    break;

	                case 2:
	                    service.viewStudents();
	                    break;

	                case 3:

	                    System.out.print("Enter ID : ");
	                    int searchId = sc.nextInt();

	                    service.searchStudent(searchId);
	                    break;

	                case 4:

	                    System.out.print("Enter ID : ");
	                    int updateId = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Enter New Name : ");
	                    String newName = sc.nextLine();

	                    System.out.print("Enter New Marks : ");
	                    double newMarks = sc.nextDouble();

	                    service.updateStudent(updateId, newName, newMarks);
	                    break;

	                case 5:

	                    System.out.print("Enter ID : ");
	                    int deleteId = sc.nextInt();

	                    service.deleteStudent(deleteId);
	                    break;

	                case 6:
	                    System.out.println("Thank You");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid Choice");
	            }
	        }
	    }
	

}
