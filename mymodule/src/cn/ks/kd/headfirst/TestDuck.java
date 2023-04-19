package cn.ks.kd.headfirst;

import cn.ks.kd.animal.constant;

import java.util.ArrayList;

public class TestDuck {
    public static void main(String[] args) {
        Duck aduck  = new Duck(123);
        System.out.println(aduck.getDuckCount());
        Duck bduck  = new Duck();
        System.out.print(bduck.getDuckCount());
        double x = 12.4 * constant.PI;
        System.out.println(x);
        TestDuck td = new TestDuck();
        td.doNmuberNewWay();
    }
    public void doNmuberNewWay(){
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(3);
        System.out.println(numList.get(0));
    }

}
