package 中介者模式.中介采销存;

/**
 * 由于要使用中介者，我们增加了一个抽象同事类，三个具体的实现类分别继承该抽象
 * 类
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator){
        this.mediator = _mediator;
    }
}
