package 责任链模式.责任链模式三从制度;

import 责任链模式.三从制度.IWomen;

/**
 * 方法比较长，但是还是比较简单的，读者有没有看到，其实在这里也用到模板方法模
 * 式，在模板方法中判断请求的级别和当前能够处理的级别，如果相同则调用基本方法，做出
 * 反馈；如果不相等，则传递到下一个环节，由下一环节做出回应，如果已经达到环节结尾，
 * 则直接做不同意处理。基本方法response需要各个实现类实现，每个实现类只要实现两个职
 * 责：一是定义自己能够处理的等级级别；二是对请求做出回应
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level =0;
    //责任传递，下一个人责任人是谁
    private Handler nextHandler;
    //每个类都要说明一下自己能处理哪些请求
    public Handler(int _level){
        this.level = _level;
    }
    //一个女性（女儿、妻子或者是母亲）要求逛街，你要处理这个请求
    public final void HandleMessage(IWomen women){
        if(women.getType() == this.level){
            this.response(women);
        }else{
            if(this.nextHandler != null){ //有后续环节，才把请求往后递送
                this.nextHandler.HandleMessage(women);
            }else{ //已经没有后续处理人了，不用处理了
                System.out.println("---没地方请示了，按不同意处理---\n");
            }
        }
    }
    /*
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了，
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     */
    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }
    //有请示那当然要回应
    protected abstract void response(IWomen women);
}

