package 建造者模式.通用代码;

/**
 * setPart方法是零件的配置，什么是零件？其他的对象，获得一个不同零件，或者
 * 不同的装配顺序就可能产生不同的产品
 *
 * 如果有多个产品类就有几个具体的建造者，而且这多个产品类具有相同
 * 接口或抽象类
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    //设置产品零件
    public void setPart(){
        /*
         * 产品类内的逻辑处理
         */
    }
    //组建一个产品
    public Product buildProduct() {
        return product;
    }

}
