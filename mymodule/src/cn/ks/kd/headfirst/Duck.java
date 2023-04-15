package cn.ks.kd.headfirst;

public class Duck {
    int size;

    public Duck(){
        System.out.println("create a Duck");
    }
    public Duck(int vsize){
        size = vsize;
        System.out.println("create a Duck and size: " + Integer.toString(size));
    }
    private Duck(String msg,int vsize){
        size = vsize;
        System.out.println("create a Duck and size: " + Integer.toString(size));
        System.out.println("Duck said: " + msg);

    }
}
