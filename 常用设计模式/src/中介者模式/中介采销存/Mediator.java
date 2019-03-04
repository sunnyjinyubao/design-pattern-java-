package 中介者模式.中介采销存;

/**
 * 建立了两个抽象类AbstractMediator和AbstractColeague，每个对象只是与中介者Mediator
 * 之间产生依赖，与其他对象之间没有直接关系，AbstractMediator的作用是实现中介者的抽象
 * 定义，定义了一个抽象方法execute
 *
 * 中介者Mediator定义了多个private方法，其目的是处理各个对象之间的依赖关系，就是
 * 说把原有一个对象要依赖多个对象的情况移到中介者的private方法中实现。在实际项目中，
 * 一般的做法是中介者按照职责进行划分，每个中介者处理一个或多个类似的关联请求
 */
public class Mediator extends AbstractMediator {
    //中介者最重要的方法
    public void execute(String str,Object...objects){
        if(str.equals("purchase.buy")){ //采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){ //销售电脑
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offsell")){ //折价销售
            this.offSell();
        }else if(str.equals("stock.clear")){ //清仓处理
            this.clearStock();
        }
    }
    //采购电脑
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if(saleStatus>80){ //销售情况良好
            System.out.println("采购IBM电脑:"+number + "台");
            super.stock.increase(number);
        }else{ //销售情况不好
            int buyNumber = number/2; //折半采购
            System.out.println("采购IBM电脑："+buyNumber+ "台");
        }
    }
    //销售电脑
    private void sellComputer(int number){
        if(super.stock.getStockNumber()<number){ //库存数量不够销售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    //折价销售电脑
    private void offSell(){
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
    //清仓处理
    private void clearStock(){
//要求清仓销售
        super.sale.offSale();
//要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
