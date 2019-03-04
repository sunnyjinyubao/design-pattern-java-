package 原型模式.浅拷贝;

/**
 * Object类提供
 * 的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，还是指向原生对象
 * 的内部元素地址，这种拷贝就叫做浅拷贝。确实是非常浅，两个对象共享了一个私有变量，
 * 你改我改大家都能改，是一种非常不安全的方式，在实际项目中使用还是比较少的（当然，
 * 这也是一种“危机”环境的一种救命方式）。你可能会比较奇怪，为什么在Mail那个类中就可
 * 以使用String类型，而不会产生由浅拷贝带来的问题呢？内部的数组和引用对象才不拷贝，
 * 其他的原始类型比如int、long、char等都会被拷贝，但是对于String类型，Java就希望你把它
 * 认为是基本类型，它是没有clone方法的，处理机制也比较特殊，通过字符串池（stringpool）
 * 在需要的时候才在内存中创建新的字符串，读者在使用的时候就把String当做基本类使用即
 * 可。
 *
 * 注意 使用原型模式时，引用的成员变量必须满足两个条件才不会被拷贝：一是类的成
 * 员变量，而不是方法内变量；二是必须是一个可变的引用对象，而不是一个原始类型或不可
 * 变对象
 */
public class Client {
    public static void main(String[] args) {
//产生一个对象
        Thing thing = new Thing();
//设置一个值
        thing.setValue("张三");
//拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
