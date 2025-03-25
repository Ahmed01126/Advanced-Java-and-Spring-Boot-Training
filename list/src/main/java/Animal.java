@FunctionalInterface
public interface Animal {
    void eat();

    default void sleep() {
        System.out.println("I'm sleeping");
    }
}
