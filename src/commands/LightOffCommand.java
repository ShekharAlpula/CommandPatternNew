package commands;
import receivers.Light;

public class LightOffCommand implements Command{
    private Light light;
    
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.LightOff();
    }

    @Override
    public void undo() {
        light.LightOn();
    }

}
