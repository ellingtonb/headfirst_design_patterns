public class SingletonDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setId(1);
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setId(2);

        singleton1.printSignature();
        System.out.println(singleton1.getId());
        System.out.println();
        singleton2.printSignature();
        System.out.println(singleton2.getId());
    }
}
