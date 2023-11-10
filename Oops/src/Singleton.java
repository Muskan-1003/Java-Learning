public class Singleton {
    private static Singleton instance = null;

    // Private constructor to prevent direct instantiation
    private Singleton() {
        // Initialization code, if needed
    }

    // Method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
