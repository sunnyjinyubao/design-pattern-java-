package 工厂模式.通用代码模式;

public abstract class Creator {
    /*
     *  创建一个产品对象， 输入参数可以自己设置
     *  通常为String，enum, Class等， 当然也可以为空
     */
    public abstract <T extends AbstructProduct> T createProduct(Class<T> t);
}
