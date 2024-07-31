/*
4.	Define Controller Class:
	Create a class StudentController that handles the communication between the model and the view.

 */
import javax.swing.text.View;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentId(String id){
        model.setId(id);
    }
    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displayStudent(model.getName(), model.getId(), model.getGrade());
    }

}
