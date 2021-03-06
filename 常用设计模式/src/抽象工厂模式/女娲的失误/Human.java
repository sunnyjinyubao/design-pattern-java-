package 抽象工厂模式.女娲的失误;

/**
 * Java的典型类图，一个接口，多个抽象类，然后是N
 * 个实现类，每个人种都是一个抽象类，性别是在各个实现类中实现的。特别需要说明的是
 * HumanFactory接口，在这个接口中定义了三个方法，分别用来生产三个不同肤色的人种，也
 * 就是我们在图9-1中的Y坐标，它的两个实现类分别是性别，也就是图9-1中的X坐标，通过X
 * 坐标（性别）和Y坐标（肤色）唯一确定了一个生产出来的对象。
 */
public interface Human {
    //每个人种都有相应的颜色
    public void getColor();
    //人类会说话
    public void talk();
    //每个人都有性别
    public void getSex();
}
