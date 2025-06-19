//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer PC = new Computer.Builder("Intel i5", "32GB")
                .setStorage("1TB SSD")
                .build();

        System.out.println(PC.toString());
    }
}