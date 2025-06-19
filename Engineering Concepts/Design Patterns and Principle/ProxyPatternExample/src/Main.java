//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Image img1=new ProxyImage("photo1.jpg");
        Image img2=new ProxyImage("photo2.jpg");

        img1.display();
        img1.display();
        img2.display();
    }
}