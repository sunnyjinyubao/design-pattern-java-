package 代理模式.通用代码;

/**
 * 代理模式的核心就在代理类上，
 *一个代理类可以代理多个被委托者或被代理者，因此一个代理类具体代理哪个真实主题
 * 角色，是由场景类决定的。当然，最简单的情况就是一个主题类和一个代理类，这是最简洁
 * 的代理模式。在通常情况下，一个接口只需要一个代理类就可以了，具体代理哪个实现类由
 * 高层模块来决定，也就是在代理类的构造函数中传递被代理者，例如我们可以在代理类
 * Proxy中增加如代码清单12-9所示的构造函数。
 *
 * public Proxy(Subject _subject){
 * this.subject = _subject;
 *
 * 你要代理谁就产生该代理的实例，然后把被代理者传递进来，该模式在实际的项目应用
 * 中比较广泛
 * }
 */
public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject = null;
    //默认被代理者
    public Proxy(){
        this.subject = new Proxy();
    }
    //通过构造函数传递代理者
    public Proxy(Object...objects ){
    }
    //实现接口中定义的方法
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //预处理
    private void before(){
        //do something
    }
    //善后处理
    private void after(){
        //do something
    }
}
