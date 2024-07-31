/*
1.	Understand Linked Lists:
    Explain the different types of linked lists (Singly Linked List, Doubly Linked List).
        *Single linked List : Each node contains data and link to next node in the sequence
        *Doubly Linked List : Each node contains link to next and previous data in the sequence
2.	Setup:
Create a class Task with attributes like taskId, taskName, and status
 */
public class Task {
    private int TaskId;
    private String TaskName;
    private String Status;

    public Task(int TaskId, String Taskname, String Status){
        this.TaskId = TaskId;
        this.TaskName = Taskname;
        this.Status = Status;
    }

    public int getTaskId() {
        return TaskId;
    }

    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
    @Override
    public String toString(){
        return "TASK [TaskID = "+TaskId+", TaskName = "+TaskName+", Status = "+Status+" ]";
    }
}
