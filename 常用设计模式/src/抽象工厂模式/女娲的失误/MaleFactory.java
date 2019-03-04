package 抽象工厂模式.女娲的失误;

public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    //生产出黄人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
