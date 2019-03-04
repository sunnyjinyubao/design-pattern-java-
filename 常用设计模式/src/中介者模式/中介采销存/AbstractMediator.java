package 中介者模式.中介采销存;

import 中介者模式.采销存.Purchase;
import 中介者模式.采销存.Sale;
import 中介者模式.采销存.Stock;

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;
    //构造函数
    public AbstractMediator(){
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }
    //中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str,Object...objects);
}

