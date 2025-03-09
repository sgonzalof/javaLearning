//package com.hubberspot.swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

class LookAndFeel extends JFrame {

    private JPanel panel;
    private JTextField textField;
    
    public LookAndFeel() {
     
        setTitle("Look And Feel Demo");
        setSize(300, 200);
        
        panel = new JPanel();
        
        textField = new JTextField("Metal look and feel");
        textField.setBackground(Color.cyan);
        
        LookAndFeelInfo[] installedLookAndFeels = UIManager.getInstalledLookAndFeels();
        
        for(LookAndFeelInfo lookAndFeel : installedLookAndFeels) {
            
            final String name = lookAndFeel.getName();
            final String className = lookAndFeel.getClassName();
            
            JButton button = new JButton(name);
            panel.add(button);
            
            button.addActionListener(new ActionListener()
            {
               public void actionPerformed(ActionEvent event)
               {
                  try
                  {
                     UIManager.setLookAndFeel(className);
                     SwingUtilities.updateComponentTreeUI(LookAndFeel.this);
                     textField.setText(name + " look and feel");
                  }
                  catch (Exception e)
                  {
                     e.printStackTrace();
                  }
               }
            });
        }
        
        panel.add(textField);
        add(panel);
         
    }
}


public class LookAndFeelTest {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                LookAndFeel frame = new LookAndFeel();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

}   





