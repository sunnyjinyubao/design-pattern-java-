package 责任链模式.通用代码;

import com.sun.deploy.nativesandbox.comm.Request;

public class ConcreteHandler2 extends Handler {
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
