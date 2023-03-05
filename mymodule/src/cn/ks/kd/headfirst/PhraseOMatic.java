package cn.ks.kd.headfirst;

public class PhraseOMatic {
    public static void main(String[] args) {
        //随意增加其他术语
        String[] wordListOne = {"24/7","multi-Tier","30000 foot","B-to-B","win-win",
                                "front-end", "web-based","pervasive", "smart", "six-sigma",
                                "critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky","value-added", "oriented", "centric",
                                "distributed", "clustered", "branded","outside-the-box",
                                "positioned", "networked", "focused", "leveraged", "aligned",
                                "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture",
                                  "core competency", "strategy", "mindshare", "portal", "space", "vision",
                                  "paradigm", "mission"};
        //计算每个数组的长度
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // ׂ生成随机数
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // 拼接专家术语
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        //输出专家术语和随机数
        System.out.println("rand1 " + rand1);
        System.out.println("rand2 " + rand2);
        System.out.println("rand3 " + rand3);
        System.out.println("What we need is a " + phrase);
    }
}
