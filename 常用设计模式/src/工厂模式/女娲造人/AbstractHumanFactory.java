package 工厂模式.女娲造人;

public abstract class AbstractHumanFactory {

    // 负责创建人类
    public abstract <T extends Human> T createHuman(Class<T> c);

    public void getMe() {
        System.out.println("你获得了我");
    }
}
