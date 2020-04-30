public class Singleton {
    final private static Singleton uniqueInstance = new Singleton();

    private static int id;

    private Singleton() {}

    public static Singleton getInstance() {
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
