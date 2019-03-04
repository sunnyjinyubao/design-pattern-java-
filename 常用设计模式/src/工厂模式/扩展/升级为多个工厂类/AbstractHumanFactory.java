package 工厂模式.扩展.升级为多个工厂类;

import 工厂模式.女娲造人.Human;

/**
 * 每个人种（具体的产品类）都对应了一个创建者，每个创建者都独立负责创建对应的产
 * 品对象，非常符合单一职责原则，按照这种模式我们来看看代码变化
 *
 * 抽象方法中已经不再需要传递相关参数了，因为每一个具体的工厂都已经非常明
 * 确自己的职责：创建自己负责的产品类对象
 */
public abstract class AbstractHumanFactory {
    public abstract Human createHuman();
}
