package cn.ks.kd.headfirst;

public class myOutClass {
    int x;
    myInnerClass mic = new myInnerClass();
    class myInnerClass{
        public void go(){
            x = 42;
            System.out.print(x);
        }
    }
    public void goStuff(){
        mic.go();
    }

    public static void main(String[] args) {
        myOutClass moc = new myOutClass();
        moc.goStuff();
    }
}
