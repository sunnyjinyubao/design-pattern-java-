package 责任链模式.责任链模式三从制度;

import 责任链模式.三从制度.IWomen;

import java.util.ArrayList;
import java.util.Random;

/**
 * 业务调用类Client也不用去做判断到底是需要谁去处理，而且Handler抽象
 * 类的子类可以继续增加下去，只需要扩展传递链而已，调用类可以不用了解变化过程，甚至
 * 是谁在处理这个请求都不用知道。在这种模式下，即使现代社会的一个小太妹穿越到古代
 * （例如掉入时空隧道，或者时空突然扭转，甚至是突然魔法显灵），对“三从四德”没有任何
 * 了解也可以自由地应付，反正只要请示父亲就可以了，该父亲处理就父亲处理，不该父亲处
 * 理就往下传递。
 */
public class Client {
    public static void main(String[] args) {
//随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i=0;i<5;i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }
//定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
//设置请示顺序
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women:arrayList){
            father.HandleMessage(women);
        }
    }
}
