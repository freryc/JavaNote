/**
 * 多线程同步方法实现单例
 *
 */
public class Singleton3 {
    private static Singleton3 singleton3;

    private Singleton3() {

    }

    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }

        return singleton3;
    }

    public void printSomething() {
        System.out.println("同步方法实现单例模式");
    }
}
