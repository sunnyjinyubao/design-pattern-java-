package 工厂模式.扩展.延迟初始化;

import 工厂模式.通用代码模式.AbstructProduct;
import 工厂模式.通用代码模式.Pruduct1;
import 工厂模式.通用代码模式.Pruduct2;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过定义一个Map容器，容纳所有产生的对象，如果在Map容器中已
 * 经有的对象，则直接取出返回；如果没有，则根据需要的类型产生一个对象并放入到Map容
 * 器中，以方便下次调用。
 *
 * 延迟加载框架是可以扩展的，例如限制某一个产品类的最大实例化数量，可以通过判断
 * Map中已有的对象数量来实现，这样的处理是非常有意义的，例如JDBC连接数据库，都会
 * 要求设置一个MaxConnections最大连接数量，该数量就是内存中最大实例化的数量。
 *
 * 延迟加载还可以用在对象初始化比较复杂的情况下，例如硬件访问，涉及多方面的交
 * 互，则可以通过延迟加载降低对象的产生和销毁带来的复杂性
 */
public class ProductFactory {
    private static final Map<String, AbstructProduct> prMap = new HashMap();
    public static synchronized AbstructProduct createProduct(String type) throws Exception{
        AbstructProduct product =null;
        //如果Map中已经有这个对象
        if(prMap.containsKey(type)){
            product = prMap.get(type);
        }else{
            if(type.equals("Product1")){
                product = new Pruduct1();
            }else{
                product = new Pruduct2();
            }
            //同时把对象放到缓存容器中
            prMap.put(type,product);
        }
        return product;
    }
}
