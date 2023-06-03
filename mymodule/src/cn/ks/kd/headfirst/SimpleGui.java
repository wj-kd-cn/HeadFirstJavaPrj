package cn.ks.kd.headfirst;

import javax.swing.*;

public class SimpleGui {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame();
        JButton jb1 = new JButton("test");
        jb1.setSize(30,30);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.getContentPane().add(jb1);

        jf1.setSize(1024,768);
        jf1.setVisible(true);
    }


}
