package DesignPattern.Singleton;

import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) throws Exception {
        // Create an instance of Samosa
        // Samosa samosa1 = Samosa.getSamosa();
        // System.out.println(samosa1.hashCode());

        // Samosa samosa2 = Samosa.getSamosa();
        // System.out.println(samosa2.hashCode());
        // Bcz The hashcode of both samosa1 and samosa2 is same, it means that both are referring to the same object in memory, confirming that only one instance of Samosa is created.
        
        // System.out.println(Jalebi.getJalebi().hashCode());
        // System.out.println(Jalebi.getJalebi().hashCode());

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        // Breaking by Reflection API
        Constructor<Samosa> consrtuctor = Samosa.class.getDeclaredConstructor();
        consrtuctor.setAccessible(true);
        Samosa s2 = consrtuctor.newInstance();
        System.out.println(s2.hashCode());

    }
}