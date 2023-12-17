package scratch;

public class Switch {

    private Command toggleLightsCommand;

    public Switch(Command toggleLightsCommand) {
        this.toggleLightsCommand = toggleLightsCommand;
    }

    public void executeToggle(){
        System.out.println("Switch called");
        toggleLightsCommand.execute();
    }


}
