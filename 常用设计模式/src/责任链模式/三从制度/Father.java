package 责任链模式.三从制度;

/**
 * 有处理权的人对妇女的请求进行处理，分别有三个实现类，在女儿没有出嫁
 * 之前父亲是有决定权的
 */
public class Father implements IHandler {
    //未出嫁的女儿来请示父亲
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
