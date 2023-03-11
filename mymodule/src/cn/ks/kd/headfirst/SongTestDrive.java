package cn.ks.kd.headfirst;

public class SongTestDrive {
    public static void main(String[] args) {
        Song asong = new Song();
        asong.title = "相思风雨中";
        asong.artist = "张学友";
        asong.playSound(35);

        asong.title = "上海滩";
        asong.artist = "刘德华";
        asong.playSound(60);

        asong.title = "沉默是金";
        asong.artist = "张国荣";
        asong.playSound(10);

    }
}
