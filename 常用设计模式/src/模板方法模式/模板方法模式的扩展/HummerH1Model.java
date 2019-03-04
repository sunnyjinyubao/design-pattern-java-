package 模板方法模式.模板方法模式的扩展;

/**
 * 在抽象类中，isAlarm是一个实现方法。其作用是模板方法根据其返回值决定是否要响
 * 喇叭，子类可以覆写该返回值，由于H1型号的喇叭是想让它响就响，不想让它响就不响，
 * 由人控制
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true; //要响喇叭
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }
    protected void start() {
        System.out.println("悍马H1发动...");
    }
    protected void stop() {
        System.out.println("悍马H1停车...");
    }
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
