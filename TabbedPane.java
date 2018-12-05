import java.awt.*;
import javax.swing.*;
public class TabbedPane extends JTabbedPane{
   //JTabbedPane tabbedPane;
   public TabbedPane(){
      super();
   	//this.tabbedPane = new JTabbedPane();
   }
   
   public void AddPanel(String name, String description){
      
      JPanel panel = new JPanel();
      this.addTab(name,  null, panel, description);
      this.setSelectedIndex(0);
   }
}