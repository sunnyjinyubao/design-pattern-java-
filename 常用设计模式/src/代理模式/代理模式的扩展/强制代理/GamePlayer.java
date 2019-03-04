package 代理模式.代理模式的扩展.强制代理;

/**
 * 增加了一个私有方法，检查是否是自己指定的代理，是指定的代理则允许访问，否则不
 * 允许访问
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //我的代理是谁
    private IGamePlayer proxy = null;
    public GamePlayer(String _name){
        this.name = _name;
    }
    //找到自己的代理
    public IGamePlayer getProxy(){
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
    //打怪，最期望的就是杀老怪
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name + "在打怪！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }
    //进游戏之前你肯定要登录吧，这是一个必要条件
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
        }else{
            System.out.println("请使用指定的代理访问");;
        }
    }
    //升级，升级有很多方法，花钱买是一种，做任务也是一种
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name + " 又升了一级！");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }
    //校验是否是代理访问
    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
