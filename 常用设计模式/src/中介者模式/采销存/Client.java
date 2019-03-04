package 中介者模式.采销存;


/**
 * ------采购人员采购电脑--------
 * IBM电脑的销售情况为：95
 * 采购IBM电脑:100台
 * 库存数量为：200
 * ------销售人员销售电脑--------
 * 销售IBM电脑1台
 * 库存数量为：199
 * ------库房管理人员清库处理--------
 * 清理存货数量为：199
 * 折价销售IBM电脑199台
 * 不再采购IBM电脑
 *
 * 运行结果也是我们期望的，三个不同类型的参与者完成了各自的活动。你有没有发现这
 * 三个类是彼此关联的？每个类都与其他两个类产生了关联关系。迪米特法则认为“每个类只
 * 和朋友类交流”，这个朋友类并非越多越好，朋友类越多，耦合性越大，要想修改一个就得
 * 修改一片，这不是面向对象设计所期望的，况且这还是仅三个模块的情况，属于比较简单的
 * 一个小项目
 */
public class Client {
    public static void main(String[] args) {
//采购人员采购电脑
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);
//销售人员销售电脑
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
//库房管理人员管理库存
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
