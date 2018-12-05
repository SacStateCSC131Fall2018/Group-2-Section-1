import java.awt.*;
import javax.swing.*;
public class TabbedPane extends JTabbedPane{
   //JTabbedPane tabbedPane;
   public TabbedPane(){
      super();
   	//this.tabbedPane = new JTabbedPane();
   }
   
<<<<<<< HEAD
   public void AddPanel(String name, String description){
      
      JPanel panel = new JPanel();
      this.addTab(name,  null, panel, description);
      this.setSelectedIndex(0);
=======
   public void AddPanel(String name, JPanel panel, String description){
      this.tabbedPane.addTab(name,  null, panel, description);
      this.tabbedPane.setSelectedIndex(0);
>>>>>>> parent of 8277aee... changed AddPanel to only accept Strings
   }
}