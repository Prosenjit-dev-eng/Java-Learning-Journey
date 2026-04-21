package DesignPattern.Singleton;

public class Samosa {
    private static Samosa samosa;// Bulti
    // Constructor called
    private  Samosa() {
        if (samosa != null) {
            throw  new RuntimeException("Use getSamosa() method to create");
        }
    }
    // Lazy Initialization: The instance of Samosa is created only when it is requested for the first time. This can save resources if the instance is not needed immediately or at all.
    public static Samosa getSamosa() {
        // Create and return an instance of Samosa
        if (samosa == null) {
            synchronized (Samosa.class) {
                // We've to synchronize the block to ensure that only one thread can create the instance at a time, preventing multiple instances from being created in a multi-threaded environment.
                if (samosa == null) {
                    samosa = new Samosa();
                }
            }

        }
        return samosa;
    }
}
