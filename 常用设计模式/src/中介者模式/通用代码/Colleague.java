package 中介者模式.通用代码;

/**
 * 同事类的基类如代码
 *
 * 这个基类也非常简单。一般来说，中介者模式中的抽象都比较简单，是为了建立这个中
 * 介而服务的
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator){
        this.mediator = _mediator;
    }
}
