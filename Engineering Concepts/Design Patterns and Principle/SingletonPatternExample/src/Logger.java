public class Logger {
    private static Logger log;
    private Logger() {
        System.out.println("Private Constrictor I cannot able to create object for this class in another class");
    }
    public static Logger getInstance() {
        if(log==null) {
            log=new Logger();
            return log;
        }
        return log;
    }

    public void check(String msg) {
        System.out.println(msg);
    }
}
