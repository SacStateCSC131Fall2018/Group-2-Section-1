public class Pirex_Driver {
	public static void main(String[] args)
	{
		//TopLevelWindow.createWindow();
      TopLevelWindow main = new TopLevelWindow();
      
      //create the tabs 
      TabbedPane tabs = new TabbedPane();
      //LoadPanel load = new LoadPanel();
      //tabs.add("Load Documents", load, "Load documents to our Pirex");
      
      //add the tabs to our main window
      MenuBar new_menu = new MenuBar();
      main.add(tabs);
      main.getContentPane().add(new_menu, BorderLayout.NORTH);
      
		
	}
}
