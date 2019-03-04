package 工厂模式.扩展.简单工厂模式;

import 工厂模式.女娲造人.BlackMan;
import 工厂模式.女娲造人.YellowMan;

/**
 * 简单工厂模式：运行结果没有发生变化，但是我们的类图变简单了，而且调用者也比较简单，该模式是
 * 工厂方法模式的弱化，因为简单，所以称为简单工厂模式（Simple Factory Pattern），也叫做
 * 静态工厂模式。在实际项目中，采用该方法的案例还是比较多的，
 *
 * 其缺点是工厂类的扩展比较困难，不符合开闭原则，但它仍然是一个非常实用的设计模式
 */
public class NvWa {
    public static void main(String[] args) {
        //女娲第一次造人，火候过足，于是黑人产生了
        BlackMan blackMan = HumanFactory.createHumen(BlackMan.class);
        blackMan.getColor();
        blackMan.say();
        //第二次造人，火候刚刚好，于是黄色人种产生了
        YellowMan yellowMan = HumanFactory.createHumen(YellowMan.class);
        yellowMan.getColor();
        yellowMan.say();
    }
}
