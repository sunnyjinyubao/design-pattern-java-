package 原型模式.clone与final;

import java.util.ArrayList;

/**
 * 粗体部分仅仅增加了一个final关键字，然后编译器就报斜体部分错误，正常呀，final类
 * 型你还想重赋值呀！你要实现深拷贝的梦想在final关键字的威胁下破灭了，路总是有的，我
 * 们来想想怎么修改这个方法：删除掉final关键字，这是最便捷、安全、快速的方式。你要使
 * 用clone方法，在类的成员变量上就不要增加final关键字。
 * 注意 要使用clone方法，类的成员变量上不要增加final关键字。
 */
public class Thing implements Cloneable{
    //定义一个私有变量
    private final ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            // this.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
