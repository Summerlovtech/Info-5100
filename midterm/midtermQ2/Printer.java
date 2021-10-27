public class Printer {
    private Printer() {

    };

    private static Printer _instance;

    private static final Object obj = new Object();

    public static Printer getInstance() {

        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Printer();
                }
            }
        }

        return _instance;
    }

    public String getConnection(){
        System.out.println("You are connected");
        return "You are connected";
    }
}