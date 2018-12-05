import java.awt.*;
import javax.swing.*;

public class MenuBar extends JMenuBar
{
      JMenuBar menuBar;
	   JMenu editMenu, fileMenu, helpMenu, optionsMenu;
	   JMenuItem item;
      public MenuBar()
      {
         super();
         menuBar = new JMenuBar();
   
   		// The File menu
   		fileMenu = new JMenu("File");
   
   
         item = new JMenuItem("Export");
         fileMenu.add(item);
         
         item = new JMenuItem("Save Query");
         fileMenu.add(item);
         
         item = new JMenuItem("Load Query");
         fileMenu.add(item);
         
         item = new JMenuItem("Open");
   		fileMenu.add(item);
         
         item = new JMenuItem("Exit");
   		fileMenu.add(item);
   		
   		menuBar.add(fileMenu);
   
   		// The Edit menu
   		editMenu = new JMenu("Edit");
   
   		item = new JMenuItem("Cut");
   		editMenu.add(item);
   
   		item = new JMenuItem("Paste");
   		editMenu.add(item);
   
   		menuBar.add(editMenu);
         //The Options Menu
         optionsMenu = new JMenu("Options");
         
         item = new JMenuItem("Options");
         optionsMenu.add(item);
         
         item = new JMenuItem("Sources");
         optionsMenu.add(item);
         
         menuBar.add(optionsMenu);
   		// The Help menu
   		helpMenu = new JMenu("Help");
         item = new JMenuItem("Index");
         helpMenu.add(item);
   
   		item = new JMenuItem("About");
   		helpMenu.add(item);
   
   		menuBar.add(helpMenu);
   
   		// The Menu bar
   }
}