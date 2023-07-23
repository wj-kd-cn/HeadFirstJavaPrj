package cn.ks.kd.headfirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButton {
    JFrame frame;
    JLabel label;
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb1 = new JButton("change lable");
        jb1.addActionListener(new lableListener());
        JButton jb2 = new JButton("change circle");
        jb2.addActionListener(new ColorListener());
        label = new JLabel("I'm a new label");
        MyDrawPanal dp1 = new MyDrawPanal();

        frame.getContentPane().add(BorderLayout.SOUTH,jb1);
        frame.getContentPane().add(BorderLayout.CENTER,dp1);
        frame.getContentPane().add(BorderLayout.EAST,jb2);
        frame.getContentPane().add(BorderLayout.WEST,label);
        frame.setSize(500,500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        TwoButton tb1 = new TwoButton();
        tb1.go();
    }
    class lableListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("ouch!!!!");
        }
    }
    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
