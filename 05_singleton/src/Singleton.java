public class Singleton {
    private static Singleton uniqueInstance;

    private static int id;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Singleton.id = id;
    }

    public static void printSignature() {
        System.out.println(uniqueInstance);
    }
}
