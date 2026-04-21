package DesignPattern.Singleton;
public class Jalebi {
    // Eager initialization
    private static Jalebi jalebi = new Jalebi();
    public static Jalebi getJalebi() {
        return jalebi;
    }
}
