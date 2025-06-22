//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light l=new Light();
        Command on=new LightOnCommand(l);
        Command off=new LightOffCommand(l);
        RemoteControl invoke=new RemoteControl();
        invoke.setCommand(on);
        invoke.pressButton();
        invoke.setCommand(off);
        invoke.pressButton();
    }
}