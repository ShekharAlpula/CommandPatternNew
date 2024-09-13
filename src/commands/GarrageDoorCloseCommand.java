package commands;

import receivers.GarrageDoor;

public class GarrageDoorCloseCommand implements Command{
    private GarrageDoor garrageDoor;
    public GarrageDoorCloseCommand(GarrageDoor garrageDoor){
        this.garrageDoor = garrageDoor;
    }
    @Override
    public void execute() {
        garrageDoor.closeDoor();
        
    }
    @Override
    public void undo() {
       garrageDoor.openDoor();
        
    }

    
}
