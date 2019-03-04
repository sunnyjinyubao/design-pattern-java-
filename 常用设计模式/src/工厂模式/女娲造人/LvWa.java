package 工厂模式.女娲造人;

public class LvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory yinyanglu = new HumanFactory();
        //女娲第一次造人，火候过足，于是黑人产生了
        BlackMan blackMan = yinyanglu.createHuman(BlackMan.class);
        blackMan.getColor();
        blackMan.say();
        //第二次造人，火候刚刚好，于是黄色人种产生了
        YellowMan yellowMan = yinyanglu.createHuman(YellowMan.class);
        yellowMan.getColor();
        yellowMan.say();
    }
}
