package 工厂模式.女娲造人;

public class YellowMan implements Human {
    @Override
    public void getColor() {
        System.out.println("我是黄色人种");
    }

    @Override
    public void say() {
        System.out.println("hello, I'am yellow");
    }
}
