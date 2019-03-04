package 工厂模式.扩展.简单工厂模式;

import 工厂模式.女娲造人.Human;

/**
 * 简单工厂模式：HumanFactory类仅有两个地方发生变化：去掉继承抽象类，并在createHuman前增加static
 * 关键字；工厂类发生变化，也同时引起了调用者NvWa的变化
 */
public class HumanFactory {
    public static <T extends Human> T createHumen(Class<T> t) {
        Human human = null;
        try{
            human = (Human) Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }

        return (T) human;
    }
}
