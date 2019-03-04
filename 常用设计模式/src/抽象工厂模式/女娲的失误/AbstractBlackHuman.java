package 抽象工厂模式.女娲的失误;

/**
 * 人种有三个抽象类，负责人种的抽象属性定义：肤色和语言。白色人种、黑色人种、黄
 * 色人种
 */
public abstract class AbstractBlackHuman implements Human {
    public void getColor(){
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
