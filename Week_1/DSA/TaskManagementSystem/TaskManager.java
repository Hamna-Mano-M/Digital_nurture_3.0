/*
3.	Implementation:
	Implement a singly linked list to manage tasks.

	Implement methods to add, search, traverse, and delete tasks in the linked list.

 */
public class TaskManager {
    private class Node{
        Task task;
        Node next;

        Node(Task task){
            this.task = task;
            this.next = null;
        }
    }
    private Node header;

    public TaskManager(){
        this.header = null;
    }

    //Add Task
    public void addTask(Task task){
        Node newNode = new Node(task);
        if(header == null){
            header = newNode;
        }
        else {
            Node current = header;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Traverse the linked list
    public void traverse(){
        Node current = header;
        while(current != null){
            System.out.println(current.task);
            current = current.next;
        }
    }

    //Search for a task using its taskID
    public Task searchTask(int taskId){
        Node current = header;
        while(current!=null){
            if(current.task.getTaskId()== taskId){
                return current.task;
            }
            current = current.next;
        }
        //if the given task Id is not found
        return null;
    }

    //Delete task
    public boolean deleteTask(int taskId){
        if(header == null){
            return false;
        }
        if(header.task.getTaskId()==taskId){
            header = header.next;
            return true;
        }

        Node current = header;
        while(current.next != null){
            if(current.next.task.getTaskId()==taskId){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask(new Task(1, "task1","Completed"));
        manager.addTask(new Task(2,"Task2","Not completed"));

        System.out.println("PRINT ALL TASKS");
        manager.traverse();

        System.out.println("SEARCH ID = 1");
        manager.searchTask(1);

        System.out.println("DELETE TASK ID = 2");
        if(manager.deleteTask(2)){
            System.out.println("DELETED TASK");
        }
        else {
            System.out.println("UNABLE TO DELETE TASK");
        }





    }


}
/*
4.	Analysis:
	Analyze the time complexity of each operation.
	    *Time complexity of the tasks add, search, delete and traverse is each O(n) where n is the size of the list.
	Discuss the advantages of linked lists over arrays for dynamic data
	    *Linked lists can grow and shrink dynamically, therefore it is easy for scaling.
	    *Linked lists are more efficient than Arrays.

 */
