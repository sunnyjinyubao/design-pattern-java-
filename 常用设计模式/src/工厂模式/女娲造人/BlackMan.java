package 工厂模式.女娲造人;

public class BlackMan implements Human{
    @Override
    public void getColor() {
        System.out.println("我是黑色人种");
    }

    @Override
    public void say() {
        System.out.println("hello, I'am black");
    }
}
