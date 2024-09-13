package invokers;

import java.util.ArrayList;

import commands.Command;
import commands.NoCommand;

public class RemoteController {
    private ArrayList<Command> onCommands;
    private ArrayList<Command> offCommands;
    private NoCommand noCommand = new NoCommand();
    private Command undoCommand = new NoCommand();

    public RemoteController(int numCommands){
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();
        for(int idx = 0; idx< numCommands; idx++){
            onCommands.add(noCommand);
            offCommands.add(noCommand);
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){        
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onPressOnButton(int slot){
        onCommands.get(slot).execute();
        undoCommand = onCommands.get(slot);
    }

    public void onPressOffButton(int slot){
        offCommands.get(slot).execute();
        undoCommand = offCommands.get(slot);
    }

    public void onPressUndoButton(){
        undoCommand.undo();
        undoCommand = noCommand;
    }
}
