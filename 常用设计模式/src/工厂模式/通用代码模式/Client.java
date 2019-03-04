package 工厂模式.通用代码模式;

public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        AbstructProduct pruduct1 =  creator.createProduct(Pruduct1.class);
        /*
         * 继续业务逻辑处理
         */
    }
}
