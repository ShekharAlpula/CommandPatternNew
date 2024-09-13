package receivers;

public class Fan {
    private String name;
    public Fan(String name){
        this.name = name;
    }

    public void fanOn(){
        System.out.println(name + " is ON");
    }

    public void fanOff(){
        System.out.println(name + " is OFF");
    }
}
