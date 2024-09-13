package receivers;

public class Light {
    private String name;
    public Light(String name){
        this.name = name;
    }
    public void LightOn(){
        System.out.println(name + " is ON");
    }
    public void LightOff(){
        System.out.println(name + " is OFF");
    }
}
