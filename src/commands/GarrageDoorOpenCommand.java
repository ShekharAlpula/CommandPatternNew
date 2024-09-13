package commands;

import receivers.GarrageDoor;

public class GarrageDoorOpenCommand implements Command {
    private GarrageDoor garrageDoor;
    public GarrageDoorOpenCommand(GarrageDoor garrageDoor){
        this.garrageDoor = garrageDoor;

    }
    @Override
    public void execute() {
        garrageDoor.openDoor();
    }
    @Override
    public void undo() {
        garrageDoor.closeDoor();
    }
}
