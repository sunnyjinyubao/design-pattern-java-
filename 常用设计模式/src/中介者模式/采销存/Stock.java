package 中介者模式.采销存;

/**
 * 库房中的货物数量肯定有增减，同时库房还有一个容量显示，达到一定的容量后就要求
 * 对一些商品进行折价处理，以腾出更多的空间容纳新产品。于是就有了clearStock方法，既
 * 然是清仓处理肯定就要折价销售了。于是在Sale类中就有了offSale方法，
 */
public class Stock {
    //刚开始有100台电脑
    private static int COMPUTER_NUMBER =100;
    //库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }
    //库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }
    //获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    //存货压力大了，就要通知采购人员不要采购，销售人员要尽快销售
    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
//要求折价销售
        sale.offSale();
//要求采购人员不要采购
        purchase.refuseBuyIBM();
    }
}
