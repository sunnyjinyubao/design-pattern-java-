package 责任链模式.三从制度;

/**
 * 我们使用数字来代表女性的不同状态：1是未结婚；2是已经结婚的，而且丈夫健在；3
 * 是丈夫去世了。从整个设计上分析，有处理权的人（如父亲、丈夫、儿子）才是设计的核
 * 心，他们是要处理这些请求的
 */
public class Women implements IWomen{
    /*
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--夫死
     */
    private int type=0;
    //妇女的请示
    private String request = "";
    //构造函数传递过来请求
    public Women(int _type,String _request){
        this.type = _type;
        this.request = _request;
    }
    //获得自己的状况
    public int getType(){
        return this.type;
    }
    //获得妇女的请求
    public String getRequest(){
        return this.request;
    }
}

