package 责任链模式.通用代码;

/**
 * 在处理者中涉及三个类：Level类负责定义请求和处理级别，Request类负责封装请
 * 求，Response负责封装链中返回的结果，该三个类都需要根据业务产生，读者可以在实际应
 * 用中完成相关的业务填充
 */
public class ConcreteHandler1 extends Handler {
    //定义自己的处理逻辑
    protected Response echo(Request request) {
//完成处理逻辑
        return null;
    }
    //设置自己的处理级别
    protected Level getHandlerLevel() {
//设置自己的处理级别
        return null;
    }
}


