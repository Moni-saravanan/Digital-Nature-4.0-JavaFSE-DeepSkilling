//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        logger1.check("Called with Logger1 instance");

        Logger logger2=Logger.getInstance();
        logger2.check("Called with Logger2 instance");

        if(logger1==logger2) {
            System.out.println("Same object is used");
        }
        else{
            System.out.println("Not a singleton object pattern program");
        }
    }
}