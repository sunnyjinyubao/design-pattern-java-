package 中介者模式.中介采销存;

/**
 * 上述Purchase类简化了很多，也清晰了很多，处理自己的职责，与外界有关系的事件处
 * 理则交给了中介者来完成
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator _mediator){
        super(_mediator);
    }
    //采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }
    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
