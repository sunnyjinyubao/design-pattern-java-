package 代理模式.我是游戏至尊;

/**
 * 定义了三个方法，分别是我们在网络游戏中最常用的功能：登录游戏、杀怪
 * 和升级
 */
public interface IGamePlayer {
    //登录游戏
    public void login(String user,String password);
    //杀怪，网络游戏的主要特色
    public void killBoss();
    //升级
    public void upgrade();
}
