package commands;

public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("No Command to execute");        
    }

    @Override
    public void undo() {
        System.out.println("No Command to execute");         
    }

}
