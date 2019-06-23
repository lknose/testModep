public class Kam {
    private static Kam kam = null;

    private Kam() {
    }

    public static Kam getK() {
        if (kam==null){
            synchronized(""){
                if (kam==null){
                  kam = new Kam();
                    return kam;
                }
            }
        }
        return kam;
    }
}
