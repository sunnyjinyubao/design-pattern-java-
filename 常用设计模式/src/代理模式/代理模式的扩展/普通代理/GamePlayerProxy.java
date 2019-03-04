package 代理模式.代理模式的扩展.普通代理;

import 代理模式.我是游戏至尊.IGamePlayer;

/**
 * 仅仅修改了构造函数，传递进来一个代理者名称，即可进行代理，在这种改造下，系统
 * 更加简洁了，调用者只知道代理存在就可以，不用知道代理了谁
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    //通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name){
        try {
            gamePlayer = new GamePlayer(this,name);
        } catch (Exception e) {
// TODO 异常处理
        }
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
}
