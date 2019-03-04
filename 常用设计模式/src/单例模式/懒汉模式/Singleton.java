package 单例模式.懒汉模式;

/**
 * 线程不安全的单例模式：懒汉模式：可以通过在获取实例的方法加上 synchronized 实现线程安全
 */
public class Singleton  {
    private static Singleton singleton = null;

    // 限制产生多个对象; 也造成其不能作为基类被继承；可扩展性降低
    private Singleton() {
    }

    // 通过该方法获得实例对象
    public static Singleton getInstance(){
        if(null == singleton) {
            singleton = new Singleton();
        }

        return singleton;
    }

    // 类中其他方法尽量是static方法
    public static void doSoming() {

    }
}
