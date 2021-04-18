/**
 * 饿汉式（no lazy load）实现
 *
 */
public class Singleton5 {
    private static final Singleton5 sinleton5 = new Singleton5();

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        return sinleton5;
    }

    public void printSomething() {
        System.out.println("饿汉式实现单例模式");
    }
}
