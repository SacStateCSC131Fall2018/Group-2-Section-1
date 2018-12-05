import java.awt.*;
import javax.swing.*;
public class TabbedPane{
   JTabbedPane tabbedPane;
   public void TabbedPane(){
      
   	this.tabbedPane = new JTabbedPane();
   }
   
   public void AddPanel(String name, JPanel panel, String description){
      this.tabbedPane.addTab(name,  null, panel, description);
      this.tabbedPane.setSelectedIndex(0);
   }
}