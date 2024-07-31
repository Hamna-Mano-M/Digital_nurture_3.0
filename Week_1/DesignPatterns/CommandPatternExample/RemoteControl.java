/*
4.	Implement Invoker Class:
	Create a class RemoteControl that holds a reference to a Command and a method to execute the command.

 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
