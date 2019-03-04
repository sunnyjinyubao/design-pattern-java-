package 抽象工厂模式.女娲的失误;

/**
 * 每个抽象类都有两个实现类，分别实现公共的最细节、最具体的事物：肤色和语言。具
 * 体的实现类实现肤色、性别定义，以黑色女性人种为例
 */
public class FemaleBlackHuman extends AbstractYellowHuman {
    //黑人女性
    public void getSex() {
        System.out.println("黑人女性");
    }
}
