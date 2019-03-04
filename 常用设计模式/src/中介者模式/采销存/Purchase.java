package 中介者模式.采销存;

/**
 * Purchase定义了采购电脑的标准：如果销售情况比较好，大于80分，你让我采购多少我
 * 就采购多少；销售情况不好，你让我采购100台，我就采购50台，对折采购。电脑采购完
 * 毕，需要放到库房中，因此要调用库存的方法，增加库存电脑数量。
 */
public class Purchase {
    //采购IBM电脑
    public void buyIBMcomputer(int number){
//访问库存
        Stock stock = new Stock();
//访问销售
        Sale sale = new Sale();
//电脑的销售情况
        int saleStatus = sale.getSaleStatus();
        if(saleStatus>80){ //销售情况良好
            System.out.println("采购IBM电脑:"+number + "台");
            stock.increase(number);
        }else{ //销售情况不好
            int buyNumber = number/2; //折半采购
            System.out.println("采购IBM电脑："+buyNumber+ "台");
        }
    }
    //不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
