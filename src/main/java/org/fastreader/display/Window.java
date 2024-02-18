package org.fastreader.display;

import javax.swing.*;
import java.awt.*;

public class Window {
    private final JLabel label;


    public Window(String title, int x, int y ){
        JFrame frame = new JFrame(title);
        frame.setSize(x,y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label=new JLabel();
        Font font=new Font(Font.SERIF, Font.BOLD,50);
        label.setFont(font);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
   public void updateText(String word){
        this.label.setText(word);
   }
}
