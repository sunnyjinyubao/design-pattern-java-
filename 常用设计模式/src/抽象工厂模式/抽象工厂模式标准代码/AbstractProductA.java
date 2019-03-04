package 抽象工厂模式.抽象工厂模式标准代码;

public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod(){
    }
    //每个产品相同方法，不同实现
    public abstract void doSomething();
}
