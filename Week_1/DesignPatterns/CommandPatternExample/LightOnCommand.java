/*
3.	Implement Concrete Commands:
	Create classes LightOnCommand, LightOffCommand that implement Command.

 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute(){
        light.turnOn();
    }
}
