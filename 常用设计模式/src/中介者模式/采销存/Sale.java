package 中介者模式.采销存;

import java.util.Random;

/**
 * Sale类中的getSaleStatus是获得销售情况，这个当然要出现在Sale类中了。记住要把恰当
 * 的类放到恰当的类中，销售情况只有销售人员才能反馈出来，通过百分制的机制衡量销售情
 * 况。
 */
public class Sale {
    //销售IBM电脑
    public void sellIBMComputer(int number){
//访问库存
        Stock stock = new Stock();
//访问采购
        Purchase purchase = new Purchase();
        if(stock.getStockNumber()<number){ //库存数量不够销售
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑"+number+"台");
        stock.decrease(number);
    }
    //反馈销售情况，0～100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }
    //折价处理
    public void offSale(){
//库房有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
}
