/**
 * 多线程场景线程安全的单例模式实现
 * 双重检查锁
 *
 */
public class Singletong2 {
    private static Singletong2 singletong2;
    private static final Object LOCK = new Object();

    private Singletong2() {

    }

    public static Singletong2 getInstance() {
        if (singletong2 == null) {
            synchronized (LOCK) {
                if (singletong2 == null) {
                    singletong2 = new Singletong2();
                }
            }
        }
        return singletong2;
    }

    public void printSomething() {
        System.out.println("多线程双重检查锁实现单例");
    }
}
