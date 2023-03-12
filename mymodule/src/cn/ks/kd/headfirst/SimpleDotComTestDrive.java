package cn.ks.kd.headfirst;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        testDrive2();
    }
    public static void testDrive1(){
        SimpleDotCom sdc = new SimpleDotCom();
        int[] locations = {2,3,4};
        sdc.setLocationCells(locations);
        String userGuess = "4";
        System.out.println("SimpleDotComTestDrive: " + sdc.checkYourSelf(userGuess));

    }
    public static void testDrive2(){
        SimpleDotCom sdc = new SimpleDotCom();
        int vradom = (int)(Math.random() * 5);
        System.out.println("cell1: " + (vradom + 1) + " cell2 " + (vradom + 2) + " cell3 " + (vradom + 3));
        int[] locations = {vradom + 1,vradom + 2 ,vradom + 3};
        sdc.setLocationCells(locations);
        GameHelper vgh = new GameHelper();
        String userGuess = vgh.getUserInput("请输入一个数字：");
        System.out.println("SimpleDotComTestDrive: " + sdc.checkYourSelf(userGuess));

    }
}
