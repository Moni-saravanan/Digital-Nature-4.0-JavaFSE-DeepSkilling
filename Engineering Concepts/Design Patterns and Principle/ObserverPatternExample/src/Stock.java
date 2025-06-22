public interface Stock {
    public void register(Observer o);
    public void deRegister(Observer o);
    public void notifyObserver();
}
