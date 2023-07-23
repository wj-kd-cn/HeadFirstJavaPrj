package cn.ks.kd.headfirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class TextArea1 implements ActionListener {

    JTextArea text;

    public static void main(String[] args) {
        TextArea1 ta1 = new TextArea1();
        ta1.go();

    }

    public void go(){
        JFrame jf1 = new JFrame();
        JPanel jp1 = new JPanel();
        JButton jb1 = new JButton("Just Click it");
        jb1.addActionListener(this);
        text = new JTextArea(10,20);
        text.setLineWrap(true);

        JScrollPane jsp1 = new JScrollPane(text);
        jsp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jp1.add(jsp1);
        jf1.getContentPane().add(BorderLayout.CENTER,jp1);
        jf1.getContentPane().add(BorderLayout.SOUTH,jb1);

        jf1.setSize(10,20);
        jf1.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        text.append("button clicked \n");
    }

}
