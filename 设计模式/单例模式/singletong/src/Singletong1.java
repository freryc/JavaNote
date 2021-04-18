/**
 * 单线程懒汉式实现单例模式
 *
 */
public class Singletong1 {
    private static Singletong1 singletong1;

    private Singletong1() {

    }

    public static Singletong1 getInstance() {
        if (singletong1 == null) {
            singletong1 = new Singletong1();
        }
        return singletong1;
    }

    public void pringSomething() {
        System.out.println("单线程Lazy Load单例");
    }
}
