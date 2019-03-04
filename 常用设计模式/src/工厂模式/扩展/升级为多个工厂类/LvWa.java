package 工厂模式.扩展.升级为多个工厂类;

import 工厂模式.女娲造人.BlackMan;
import 工厂模式.女娲造人.YellowMan;

/**
 * 运行结果还是相同。我们回顾一下，每一个产品类都对应了一个创建类，好处就是创建
 * 类的职责清晰，而且结构简单，但是给可扩展性和可维护性带来了一定的影响。为什么这么
 * 说呢？如果要扩展一个产品类，就需要建立一个相应的工厂类，这样就增加了扩展的难度。
 * 因为工厂类和产品类的数量相同，维护时需要考虑两个对象之间的关系。
 * 当然，在复杂的应用中一般采用多工厂的方法，然后再增加一个协调类，避免调用者与
 * 各个子工厂交流，协调类的作用是封装子工厂类，对高层模块提供统一的访问接口。
 */
public class LvWa {
    public static void main(String[] args) {
        //女娲第一次造人，火候过足，于是黑人产生了
        BlackMan blackMan = (BlackMan) (new BlackHumanFactory()).createHuman();
        blackMan.getColor();
        blackMan.say();
        //第二次造人，火候刚刚好，于是黄色人种产生了
        YellowMan yellowMan = (YellowMan) (new BlackHumanFactory()).createHuman();
        yellowMan.getColor();
        yellowMan.say();
    }
}
