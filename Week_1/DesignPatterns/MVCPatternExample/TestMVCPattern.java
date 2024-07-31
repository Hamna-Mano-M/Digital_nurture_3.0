/*
5.	Test the MVC Implementation:
	Create a main class to demonstrate creating a Student, updating its details using StudentController, and displaying them using StudentView.

 */
import javax.swing.text.View;

public class TestMVCPattern {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("S12345");
        student.setName("John Doe");
        student.setGrade("A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Display initial student details
        controller.updateView();

        // Update model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("A+");

        // Display updated student details
        controller.updateView();
    }
}
