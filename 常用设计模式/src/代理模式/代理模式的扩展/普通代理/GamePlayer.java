package 代理模式.代理模式的扩展.普通代理;

import 代理模式.我是游戏至尊.IGamePlayer;

/**
 * 在构造函数中，传递进来一个IGamePlayer对象，检查谁能创建真实的角色，当然还可以
 * 有其他的限制，比如类名必须为Proxy类等
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception{
        if(_gamePlayer == null ){
            throw new Exception("不能创建真实角色！");
        }else{
            this.name = _name;
        }
    }
    //打怪，最期望的就是杀老怪
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }
    //进游戏之前你肯定要登录吧，这是一个必要条件
    public void login(String user, String password) {
        System.out.println("登录名为"+user + "的用户" + this.name + "登录成功！");
    }
    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
