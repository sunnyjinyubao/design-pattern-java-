package 工厂模式.扩展.替代单例模式;

import 单例模式.懒汉模式.Singleton;

import java.lang.reflect.Constructor;

/**
 * 利用多工厂模式创建单例对象
 *
 * 通过获得类构造器，然后设置访问权限，生成一个对象，然后提供外部访问，保证内存
 * 中的对象唯一。当然，其他类也可以通过反射的方式建立一个单例对象，确实如此，但是一
 * 个项目或团队是有章程和规范的，何况已经提供了一个获得单例对象的方法，为什么还要重
 * 新创建一个新对象呢？除非是有人作恶。
 * 以上通过工厂方法模式创建了一个单例对象，该框架可以继续扩展，在一个项目中可以
 * 产生一个单例构造器，所有需要产生单例的类都遵循一定的规则（构造方法是private），然
 * 后通过扩展该框架，只要输入一个类型就可以获得唯一的一个实例。
 */
public class SingletonFactory {
    private static Singleton singleton;

    /*
     * 静态代码块仅仅在类第一次实例化的时候执行一次
     * 静态代码块 》 代码块（每次实例化都会执行一次）  》 构造函数
     */
    static {
        try{
            Class c1 = Class.forName(Singleton.class.getName());
            // 获得无参构造函数（私有的也是可以获得到）
            Constructor constructor = c1.getDeclaredConstructor();
            // 设置无参构造函数是可以访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
