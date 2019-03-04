package 抽象工厂模式.抽象工厂模式标准代码;

/**
 * 如何创建一个产品，则是由具体的实现类来完成的，Creator1和Creator2
 * 有M个产品等级就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族
 * 的生产任务。
 */
public class Creator1 extends AbstractCreator {
    //只生产产品等级为1的A产品
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生产产品等级为1的B产品
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
