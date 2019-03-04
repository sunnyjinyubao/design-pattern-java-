package 中介者模式.中介采销存;

/**
 * 在场景类中增加了一个中介者，然后分别传递到三个同事类中，三个类都具有相同的特
 * 性：只负责处理自己的活动（行为），与自己无关的活动就丢给中介者处理，程序运行的结
 * 果是相同的。从项目设计上来看，加入了中介者，设计结构清晰了很多，而且类间的耦合性
 * 大大减少，代码质量也有了很大的提升。
 * 在多个对象依赖的情况下，通过加入中介者角色，取消了多个对象的关联或依赖关系，
 * 减少了对象的耦合性。
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
//采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
//销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
//库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
