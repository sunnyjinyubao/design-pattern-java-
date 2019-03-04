package 责任链模式.三从制度;

/**
 * 女性接口仅两个方法，一个是取得当前的个人状况getType，通过返回值决定是结婚了还
 * 是没结婚、丈夫是否在世等，另外一个方法getRequest是要请示的内容，要出去逛街还是吃
 * 饭
 */
public interface IWomen {
    //获得个人状况
    public int getType();
    //获得个人请示，你要干什么？出去逛街？约会?还是看电影？
    public String getRequest();
}
