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
      JMenuBar menubar = new JMenuBar(
      main.add(tabs);
      
		
	}
}
