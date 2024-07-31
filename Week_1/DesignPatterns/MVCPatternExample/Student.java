/*
1.	Create a New Java Project:
	Create a new Java project named MVCPatternExample.
2.	Define Model Class:
	Create a class Student with attributes like name, id, and grade.

 */
public class Student {
    private String id;
    private String name;
    private String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
