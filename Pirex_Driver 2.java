import java.awt.*;
import javax.swing.*;

public class Pirex_Driver {
	public static void main(String[] args)
	{
		//TopLevelWindow.createWindow();
      //TopLevelWindow main = new TopLevelWindow();
      
      //create the tabs 
      TabbedPane tabs = new TabbedPane();
      //LoadPanel load = new LoadPanel();
      //tabs.add("Load Documents", load, "Load documents to our Pirex");
      
      //add the tabs to our main window
      JFrame Test = new JFrame();
      Test.setVisible(true);
      
      MenuBar new_menu = new MenuBar();
      //main.add(tabs);
      Test.getContentPane().add(new_menu);
      //main.getContentPane().add(new_menu, BorderLayout.NORTH);
      
		
	}
}
