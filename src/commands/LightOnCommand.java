package commands;
import receivers.Light;

public class LightOnCommand implements Command{
    private Light light;
    public  LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {       
        light.LightOn();
    }

    @Override
    public void undo() {
        light.LightOff();
    }

}
