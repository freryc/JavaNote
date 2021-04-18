/**
 * 静态内部类实现单例模式
 *
 */
public class Singleton6 {

    private Singleton6() {

    }

    private static class singletonInnerClass {
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static final Singleton6 getInstance() {
        return singletonInnerClass.INSTANCE;
    }

    public void printSomething() {
        System.out.println("静态内部类实现单例模式");
    }
}
