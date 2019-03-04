package 责任链模式.三从制度;

import java.util.ArrayList;
import java.util.Random;

/**
 * “三从四德”的旧社会规范已经完整地表现出来了，你看谁向谁请示都定义出来了，但是
 * 你是不是发现这个程序写得有点不舒服？有点别扭？有点想重构它的感觉？那就对了！这段
 * 代码有以下几个问题：
 * ● 职责界定不清晰
 * 对女儿提出的请示，应该在父亲类中做出决定，父亲有责任、有义务处理女儿的请示，
 * 因此Father类应该是知道女儿的请求自己处理，而不是在Client类中进行组装出来，也就是说
 * 原本应该是父亲这个类做的事情抛给了其他类进行处理，不应该是这样的。
 * ● 代码臃肿
 * 我们在Client类中写了if...else的判断条件，而且能随着能处理该类型的请示人员越
 * 多，if...else的判断就越多，想想看，臃肿的条件判断还怎么有可读性？！
 * ● 耦合过重
 * 这是什么意思呢，我们要根据Women的type来决定使用IHandler的那个实现类来处理请
 * 求。有一个问题是：如果IHandler的实现类继续扩展怎么办？修改Client类？与开闭原则违背
 * 了！
 * ● 异常情况欠考虑
 * 妻子只能向丈夫请示吗？如果妻子（比如一个现代女性穿越到古代了，不懂什么“三从
 * 四德”）向自己的父亲请示了，父亲应该做何处理？我们的程序上可没有体现出来，逻辑失
 * 败了！
 *
 * 既然有这么多的问题，那我们要想办法来解决这些问题，我们先来分析一下需求，女性
 * 提出一个请示，必然要获得一个答复，甭管是同意还是不同意，总之是要一个答复的，而且
 * 这个答复是唯一的，不能说是父亲作出一个决断，而丈夫也作出了一个决断，也即是请示传
 * 递出去，必然有一个唯一的处理人给出唯一的答复，OK，分析完毕，收工，重新设计，我
 * 们可以抽象成这样一个结构，女性的请求先发送到父亲类，父亲类一看是自己要处理的，就
 * 作出回应处理，如果女儿已经出嫁了，那就要把这个请求转发到女婿来处理，那女婿一旦去
 * 天国报道了，那就由儿子来处理这个请求
 *
 * 父亲、丈夫、儿子每个节点有两个选择：要么承担责任，做出回应；要么把请求转发到
 * 后序环节
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
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for(IWomen women:arrayList){
            if(women.getType() ==1){ //未结婚少女，请示父亲
                System.out.println("\n--------女儿向父亲请示-------");
                father.HandleMessage(women);
            }else if(women.getType() ==2){ //已婚少妇，请示丈夫
                System.out.println("\n--------妻子向丈夫请示-------");
                husband.HandleMessage(women);
            }else if(women.getType() == 3){ //母亲请示儿子
                System.out.println("\n--------母亲向儿子请示-------");
                son.HandleMessage(women);
            }else{
//暂时什么也不做
            }
        }
    }
}
