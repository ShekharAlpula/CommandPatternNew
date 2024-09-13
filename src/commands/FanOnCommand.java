package commands;

import receivers.Fan;

public class FanOnCommand implements Command{
    private Fan fan;
    public FanOnCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
       fan.fanOn();
        
    }

    @Override
    public void undo() {
       fan.fanOff();
        
    }

}
