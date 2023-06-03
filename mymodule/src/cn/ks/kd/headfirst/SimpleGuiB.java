package cn.ks.kd.headfirst;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class SimpleGuiB implements ActionListener, MouseMotionListener {
    JButton jb1;
    JFrame jf1;

    public static void main(String[] args) {
        SimpleGuiB sgb = new SimpleGuiB();
        sgb.go();

    }
    public void go(){
        jf1 = new JFrame();
        jf1.addMouseMotionListener(this);
        jb1 = new JButton("click me");
        jb1.addActionListener(this);
        jf1.getContentPane().add(jb1);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setSize(300,300);
        jf1.setVisible(true);



    }

    public void actionPerformed(ActionEvent ae1){

                jb1.setText("i've been  clicked ");


    }

    public void mouseDragged(MouseEvent e){
        jf1.setSize(500,500);
        System.out.println("mouse drag");

    }

    /**
     * Invoked when the mouse cursor has been moved onto a component
     * but no buttons have been pushed.
     */
    public void mouseMoved(MouseEvent e){
        jf1.setSize(800,800);
        System.out.println("mouse move");

    }
}
