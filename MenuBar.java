import java.awt.*;
import javax.swing.*;

public class MenuBar extends JMenuBar
{
	   JMenu editMenu, fileMenu, helpMenu, optionsMenu;
	   JMenuItem item;
      public MenuBar()
      {
         super();
         //this = new JMenuBar();
   
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
   		
   		this.add(fileMenu);
   
   		// The Edit menu
   		editMenu = new JMenu("Edit");
   
   		item = new JMenuItem("Cut");
   		editMenu.add(item);
   
   		item = new JMenuItem("Paste");
   		editMenu.add(item);
   
   		this.add(editMenu);
         //The Options Menu
         optionsMenu = new JMenu("Options");
         
         item = new JMenuItem("Options");
         optionsMenu.add(item);
         
         item = new JMenuItem("Sources");
         optionsMenu.add(item);
         
         this.add(optionsMenu);
   		// The Help menu
   		helpMenu = new JMenu("Help");
         item = new JMenuItem("Index");
         helpMenu.add(item);
   
   		item = new JMenuItem("About");
   		helpMenu.add(item);
   
   		this.add(helpMenu);
   
   		// The Menu bar
   }
}