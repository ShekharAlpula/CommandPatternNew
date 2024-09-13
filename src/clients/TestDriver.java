package clients;

import commands.FanOffCommand;
import commands.FanOnCommand;
import commands.GarrageDoorCloseCommand;
import commands.GarrageDoorOpenCommand;
import commands.LightOffCommand;
import commands.LightOnCommand;
import invokers.RemoteController;
import receivers.Fan;
import receivers.GarrageDoor;
import receivers.Light;

public class TestDriver {
    public static void main(String[] args) {
        Light LivingRoomLight = new Light("Living room light");
        Light kitchenLight = new Light("Kitchen light");
        Fan cielingFan = new Fan("Cieling Fan");
        Fan tableFan = new Fan("Table Fan");

        GarrageDoor garrageDoor = new GarrageDoor("Garrage door");
        RemoteController remoteController = new RemoteController(7);
        //setting Commands
        remoteController.setCommand(0, new LightOnCommand(LivingRoomLight), new LightOffCommand(LivingRoomLight));
        remoteController.setCommand(1, new FanOnCommand(cielingFan), new FanOffCommand(cielingFan));
        remoteController.setCommand(2, new GarrageDoorOpenCommand(garrageDoor), new GarrageDoorCloseCommand(garrageDoor));
        remoteController.setCommand(4, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteController.setCommand(5, new FanOnCommand(tableFan), new FanOffCommand(tableFan));


        remoteController.onPressOffButton(0);
        remoteController.onPressOffButton(0);
        remoteController.onPressUndoButton();

        remoteController.onPressOnButton(1);
        remoteController.onPressUndoButton();
    }
}
