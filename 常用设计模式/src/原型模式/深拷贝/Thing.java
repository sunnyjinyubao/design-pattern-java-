package 原型模式.深拷贝;

import java.util.ArrayList;

/**
 * 该方法就实现了完全的拷贝，两个对象之间没有任何的瓜葛了，你修改你的，我修改我
 * 的，不相互影响，这种拷贝就叫做深拷贝。深拷贝还有一种实现方式就是通过自己写二进制
 * 流来操作对象，然后实现对象的深拷贝，这个大家有时间自己实现一下。
 * 注意 深拷贝和浅拷贝建议不要混合使用，特别是在涉及类的继承时，父类有多个引用
 * 的情况就非常复杂，建议的方案是深拷贝和浅拷贝分开实现
 */
public class Thing implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public Thing clone(){
        Thing thing=null;
        try {
            thing = (Thing)super.clone();
            thing.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
