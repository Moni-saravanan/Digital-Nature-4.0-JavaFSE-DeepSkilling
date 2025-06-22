public class RemoteControl {
    Command cmd;
    public void setCommand(Command cmd) {
        this.cmd=cmd;
    }

    public void pressButton() {
        cmd.execute();
    }

}
