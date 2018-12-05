 import java.awt.*;
import javax.swing.*;

public class TopLevelWindow {

   public static void createWindow() {
      //Create and set up the window.
      JFrame mainFrame = new JFrame("Pirex");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
      //textLabel.setPreferredSize(new Dimension(300, 100));
      //frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      
      //Display the window.
      mainFrame.setLocationRelativeTo(null);
      mainFrame.setPreferredSize(new Dimension(1000, 600));
      mainFrame.setResizable(false);
      mainFrame.pack();
      mainFrame.setVisible(true);
      
      //Layout:
      mainFrame.getContentPane().setLayout(new BorderLayout());
      
      
      
      
   }
   
   
   public static void main(String[] args) {
      createWindow();
      
   }
} 