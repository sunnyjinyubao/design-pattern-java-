package 代理模式.代理模式的扩展.强制代理;

/**
 * 代理角色也可以再次被代理，这里我们就没有继续延伸下去了，查找代理的方法就返回
 * 自己的实例
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    //构造函数传递用户名
    public GamePlayerProxy(IGamePlayer _gamePlayer){
        this.gamePlayer = _gamePlayer;
    }
    //代练杀怪
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //代练登录
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //代练升级
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
    //代理的代理暂时还没有，就是自己
    public IGamePlayer getProxy(){
        return this;
    }
}
