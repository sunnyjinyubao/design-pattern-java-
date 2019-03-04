package 模板方法模式.模板方法模式的扩展;

/**
 * 背景：到目前为止，这两个模型都稳定地运行，突然有一天，老大急匆匆地找到了我：
 * “看你怎么设计的，车子一启动，喇叭就狂响，吵死人了！客户提出H1型号的悍马喇叭
 * 想让它响就响，H2型号的喇叭不要有声音，赶快修改一下。”
 *
 * 在抽象类HummerModel中增加了一个实现方法isAlarm，确定各个型
 * 号的悍马是否需要声音，由各个实现类覆写该方法，同时其他的基本方法由于不需要对外提
 * 供访问，因此也设计为protected类型。
 */
public abstract class HummerModel {
    /*
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
     * 是要能够发动起来，那这个实现要在实现类里了
     */
    protected abstract void start();
    //能发动，还要能停下来，那才是真本事
    protected abstract void stop();
    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();
    //引擎会轰隆隆的响，不响那是假的
    protected abstract void engineBoom();
    //那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
    final public void run() {
    //先发动汽车
        this.start();
    //引擎开始轰鸣
        this.engineBoom();
    //要让它叫的就是就叫，喇嘛不想让它响就不响
        if(this.isAlarm()){
            this.alarm();
        }
    //到达目的地就停车
        this.stop();
    }
    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm(){
        return true;
    }
}
