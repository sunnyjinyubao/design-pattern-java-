package 抽象工厂模式.女娲的失误;

/**
 * 八卦炉定义
 */
public interface HumanFactory {
    //制造一个黄色人种
    public Human createYellowHuman();
    //制造一个黑色人种
    public Human createBlackHuman();
}
