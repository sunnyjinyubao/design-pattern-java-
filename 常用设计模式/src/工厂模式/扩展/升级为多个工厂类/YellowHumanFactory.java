package 工厂模式.扩展.升级为多个工厂类;

import 工厂模式.女娲造人.Human;
import 工厂模式.女娲造人.YellowMan;

public class YellowHumanFactory extends AbstractHumanFactory {
    public Human createHuman() {
        return new YellowMan();
    }
}
