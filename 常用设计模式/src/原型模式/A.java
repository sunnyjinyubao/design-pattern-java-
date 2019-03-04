package 原型模式;

import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test(1, "jinyubao");
        String[] s = new String[3];
        s[0] = "0";
        s[1] = "1";
        test.setArray(s);
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        test.setList(list);
        Test test1 = test.clone();
        test1.setName("zenmanhua");
        test1.setA(2);
        list.add("c");
        s[2] = "2";
        System.out.println(test.toString());
        System.out.println(test1.toString());
    }
}
