package scratch;

public class Light {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle(){
        System.out.println("Light has been toggled");
        this.isOn = !isOn;
    }

}
