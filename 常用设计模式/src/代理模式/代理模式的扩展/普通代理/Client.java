package 代理模式.代理模式的扩展.普通代理;

import 代理模式.我是游戏至尊.IGamePlayer;

/**
 * 运行结果完全相同。在该模式下，调用者只知代理而不用知道真实的角色是谁，屏蔽了
 * 真实角色的变更对高层模块的影响，真实的主题角色想怎么修改就怎么修改，对高层次的模
 * 块没有任何的影响，只要你实现了接口所对应的方法，该模式非常适合对扩展性要求较高的
 * 场合。当然，在实际的项目中，一般都是通过约定来禁止new一个真实的角色，这也是一个
 * 非常好的方案。
 */
public class Client {
    public static void main(String[] args) {
        //然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
