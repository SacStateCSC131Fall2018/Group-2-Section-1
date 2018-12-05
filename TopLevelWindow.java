 import java.awt.*;
import javax.swing.*;

public class TopLevelWindow extends JFrame{

   public TopLevelWindow() {
      //Create and set up the window.
      //JFrame mainFrame = new JFrame("Pirex");
      super("Pirex");
      //mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
      //textLabel.setPreferredSize(new Dimension(300, 100));
      //frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      
      //Display the window.
      /*
      mainFrame.setLocationRelativeTo(null);
      mainFrame.setPreferredSize(new Dimension(1000, 600));
      mainFrame.setResizable(false);
      mainFrame.pack();
      mainFrame.setVisible(true);*/
      this.setLocationRelativeTo(null);
      this.setPreferredSize(new Dimension(1000, 600));
      this.setResizable(false);
      this.pack();
      this.setVisible(true);
      //Layout:
      this.getContentPane().setLayout(new BorderLayout());
      
      
      
   }
   
   //Add new Objects to the content pane
   public void add(JComponent o, String layout)
   {
      this.getContentPane().add(o, layout);
   
   }
   
   /*
   public static void main(String[] args) {
      createWindow();
      
   }*/
} 