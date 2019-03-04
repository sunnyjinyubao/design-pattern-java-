package 抽象工厂模式.女娲的失误;

/**
 * 我们看到八卦炉是可以生产出不同肤色人种的（当然了，女娲的失误嘛），
 * 那它有多少个八卦炉呢？两个，分别生产女性和男性，女性和男性八卦炉
 */
public class FemaleFactory implements HumanFactory {
    //生产出黑人女性
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
    //生产出黄人女性
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
