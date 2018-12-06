import java.awt.*;
import javax.swing.*;


public class Pirex_Driver {
	public static void main(String[] args)
	{
		//TopLevelWindow.createWindow();
      TopLevelWindow main = new TopLevelWindow();
      
      //create the tabs 
      TabbedPane tabs = new TabbedPane();
      //LoadPanel load = new LoadPanel();
      //tabs.add("Load Documents", load, "Load documents to our Pirex");
      
      //Creates and adds search panel to tabs
      SearchForDocument search = new SearchForDocument();
      tabs.AddPanel("Search for Documents", search, "Search documents on our Pirex");
      
      //add the tabs to our main window
      MenuBar new_menu = new MenuBar();
      main.add(tabs, BorderLayout.CENTER);
      main.getContentPane().add(new_menu, BorderLayout.NORTH);
      
		
	}
}
