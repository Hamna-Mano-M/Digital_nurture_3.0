/*
6.	Test the Command Implementation:
	Create a test class to demonstrate issuing commands using the RemoteControl.

 */
public class TestCommandPattern {
    public static void main(String[] args) {
        Light room1 = new Light();

        Command lighton = new LightOnCommand(room1);
        Command lightoff = new LightOffCommand(room1);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lighton);
        remoteControl.pressButton();

        remoteControl.setCommand(lightoff);
        remoteControl.pressButton();
    }
}
