package cn.ks.kd.headfirst;

public class TestDuck {
    public static void main(String[] args) {
        Duck aduck  = new Duck(123);
        System.out.println(aduck.getDuckCount());
        Duck bduck  = new Duck();
        System.out.print(bduck.getDuckCount());

    }

}
