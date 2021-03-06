import org.junit.Test;

/**
 * 单例测试
 *
 */
public class SingletongTest {
    @Test
    public void test1() {
        Singletong1 singletong11 = Singletong1.getInstance();
        Singletong1 singletong12 = Singletong1.getInstance();
        System.out.println(singletong11.equals(singletong12));
        Singletong1.getInstance().pringSomething();
    }

    @Test
    public void test2() {
        Singletong2 singletong21 = Singletong2.getInstance();
        Singletong2 singletong22 = Singletong2.getInstance();
        System.out.println(singletong21.equals(singletong22));
        Singletong2.getInstance().printSomething();
    }

    @Test
    public void test3() {
        Singleton3 singleton31 = Singleton3.getInstance();
        Singleton3 singleton32 = Singleton3.getInstance();
        System.out.println(singleton31.equals(singleton32));
        Singleton3.getInstance().printSomething();
    }

    @Test
    public void test4() {
        Singleton4 singleton41 = Singleton4.SINGLETON_4;
        Singleton4 singleton42 = Singleton4.SINGLETON_4;
        System.out.println(singleton41.equals(singleton42));
        Singleton4.SINGLETON_4.printSomething();
    }
	
	@Test
    public void test5() {
        Singleton5 singleton51 = Singleton5.getInstance();
        Singleton5 singleton52 = Singleton5.getInstance();
        System.out.println(singleton51.equals(singleton52));
        Singleton5.getInstance().printSomething();
    }

    @Test
    public void test6() {
        Singleton6 singleton61 = Singleton6.getInstance();
        Singleton6 singleton62 = Singleton6.getInstance();
        System.out.println(singleton61.equals(singleton62));
        Singleton6.getInstance().printSomething();
    }
}
