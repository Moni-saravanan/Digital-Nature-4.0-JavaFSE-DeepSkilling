import javax.swing.plaf.basic.BasicButtonUI;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    private Computer(Builder builder) {
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.graphicsCard=builder.graphicsCard;
        this.storage=builder.storage;
    }

    public String toString() {
        return "CPU: "+CPU+"\nRAM: "+RAM+"\nGraphics Card: "+graphicsCard+"\nStorage: "+storage;
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        public Builder(String CPU, String RAM) {
            this.CPU=CPU;
            this.RAM=RAM;
        }

        public Builder setStorage(String storage) {
            this.storage=storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard=graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


}
