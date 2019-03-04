package 原型模式;

import java.util.Arrays;
import java.util.List;

public class Test implements  Cloneable{
    private int a;
    private String name;
    private String[] array;
    private List<String> list;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public Test clone() throws CloneNotSupportedException {
        Test test = null;
        try{
            test = (Test) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return test;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                '}';
    }
}
