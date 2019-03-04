package 代理模式.代理模式的扩展.强制代理;

/**
 * 仅仅增加了一个getProxy方法，指定要访问自己必须通过哪个代理
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user,String password);
    //杀怪，这是网络游戏的主要特色
    public void killBoss();
    //升级
    public void upgrade();
    //每个人都可以找一下自己的代理
    public IGamePlayer getProxy();
}
