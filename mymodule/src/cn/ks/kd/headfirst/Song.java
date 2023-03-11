package cn.ks.kd.headfirst;

public class Song {
    String title;
    String artist;

    public void playSound(int atime){
        System.out.println("############################################################");
        System.out.println("The song " + title + "  start  be played");
        System.out.println("The artist is  " + artist);
        if(atime > 30){
            int i = 1;
            while(true) {
                if (i < atime) {
                    System.out.print(".");

                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                        System.out.println("\n" + " SHUTDOWN ");
                        break;
                    }

                    i = i + 1;

                } else {
                    System.out.println("\n" + " END ");
                    break;
                }

            }
            System.out.println("\n" + "all time  is  " + atime);
        }else{
                System.out.println("\n" + " The sony time error!");

        }
    }
}
