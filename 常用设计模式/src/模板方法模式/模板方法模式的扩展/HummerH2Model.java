package 模板方法模式.模板方法模式的扩展;

/**
 * 只要调用H1型号的悍马，默认是有喇叭响的，当然你可以不让喇叭响，通过
 * isAlarm(false)就可以实现。H2型号的悍马是没有喇叭声响的
 */
public class HummerH2Model extends HummerModel {
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }
    protected void start() {
        System.out.println("悍马H2发动...");
    }
    protected void stop() {
        System.out.println("悍马H2停车...");
    }
    //默认没有喇叭的
    protected boolean isAlarm() {
        return false;
    }
}
