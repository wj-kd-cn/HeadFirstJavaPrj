package cn.ks.kd.headfirst;

public class TestFormat {


    public static void main(String[] args) {
        String x = String.format("FORMAT 数字 %,d 格式化",10000000);
        System.out.println(x);
    }
}
