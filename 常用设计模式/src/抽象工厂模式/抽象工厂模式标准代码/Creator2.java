package 抽象工厂模式.抽象工厂模式标准代码;

public class Creator2 extends AbstractCreator {
    //只生产产品等级为2的A产品
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生产产品等级为2的B产品
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
