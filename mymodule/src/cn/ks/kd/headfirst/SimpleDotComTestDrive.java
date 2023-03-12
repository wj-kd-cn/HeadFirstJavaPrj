package cn.ks.kd.headfirst;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom sdc = new SimpleDotCom();
        int[] locations = {2,3,4};
        sdc.setLocationCells(locations);
        String userGuess = "7";
        System.out.println("SimpleDotComTestDrive: " + sdc.checkYourSelf(userGuess));
    }
}
