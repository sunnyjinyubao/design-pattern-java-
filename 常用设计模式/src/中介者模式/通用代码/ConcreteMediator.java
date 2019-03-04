package 中介者模式.通用代码;

/**
 * 中介者所具有的方法doSomething1和doSomething2都是比较复杂的业务逻辑，为同事类
 * 服务，其实现是依赖各个同事类来完成的。
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
//调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
