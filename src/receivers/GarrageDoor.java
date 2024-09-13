package receivers;

public class GarrageDoor {
    private String name;
    public GarrageDoor(String name){
        this.name = name;
    }
    public void openDoor(){
        System.out.println(name + " is Opened");
    }

    public void closeDoor(){
        System.out.println(name + " is closed");
    }
}
