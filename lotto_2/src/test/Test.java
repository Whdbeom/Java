package test;

import javax.swing.*;
import java.awt.*;

public class Test {
    public void img() {
   
        String imagePath = "C:\\Users\\종범\\Desktop\\177fb710e1a4b2e51.jpg"; 


        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("로또");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new JLabel(new ImageIcon(imagePath)));
            frame.pack();
            frame.setVisible(true);
        });
    }
}