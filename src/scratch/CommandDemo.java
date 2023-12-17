package scratch;

import command.ToggleCommand;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {


    public static void main(String[] args) {
//        Light light = new Light();
//
//        Command toggleCommand = new ToggleLightCommand(light);
//
//        Switch lightSwitch = new Switch(toggleCommand);
//
//        lightSwitch.executeToggle();
//
//        lightSwitch.executeToggle();
        //////////////
        List<Light> lights = new ArrayList<>();
        lights.add(new Light());
        lights.add(new Light());

        Command toggleAllLights = new ToggleAllLightsCommand(lights);

        Switch houseSwitch = new Switch(toggleAllLights);
        houseSwitch.executeToggle();

    }


}
