package 责任链模式.通用代码;

/**
 * 在实际应用中，一般会有一个封装类对责任模式进行封装，也就是替代Client类，直接
 * 返回链中的第一个处理者，具体链的设置不需要高层次模块关系，这样，更简化了高层次模
 * 块的调用，减少模块间的耦合，提高系统的灵活性
 */
public class Client {
    public static void main(String[] args) {
//声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
//设置链中的阶段顺序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
//提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
