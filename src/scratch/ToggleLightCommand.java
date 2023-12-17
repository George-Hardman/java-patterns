package scratch;

public class ToggleLightCommand implements Command{

    private Light light;

    public ToggleLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
