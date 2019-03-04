package 单例模式.饿汉模式;

/**
 * 线程安全的单例模式：懒汉模式
 */
public class Singleton {
    // 使用静态初始化的好处：每次不用每次都来检查
    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象; 也造成其不能作为基类被继承；可扩展性降低
    private Singleton() {
    }

    // 通过该方法获得实例对象
    public static Singleton getInstance(){
        return singleton;
    }

    // 类中其他方法尽量是static方法
    public static void doSoming() {

    }
}
