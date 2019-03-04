package 工厂模式.通用代码模式;

public class ConcreteCreator extends Creator {
    @Override
    public <T extends AbstructProduct> T createProduct(Class<T> t) {
        AbstructProduct abstructProduct = null;
        try {
            abstructProduct = (AbstructProduct) Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
           // 异常处理
        }

        return (T) abstructProduct;
    }
}
