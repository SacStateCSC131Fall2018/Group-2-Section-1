//Panel for loading documents
import java.awt.*;
import javax.swing.*;

public class LoadPanel extends JPanel
{
    //Constructor
   public LoadPanel()
   {
      super();
      setLayout();
   }

   //Set layout of the load panel
   private void setLayout()
   {
      JPanel MAINPANEL = new JPanel();  // This panel is the mail panel and holds all the other panels
		
      JPanel panel = new JPanel(new GridLayout(5,0)); //this panel creates a grid holds three panels
		
      JPanel p1 = new JPanel(new FlowLayout());
		JPanel p1subPanel = new JPanel(new FlowLayout());
      
      JPanel p2 = new JPanel(new BorderLayout());
		
      JPanel p3 = new JPanel(new BorderLayout());
		JPanel p3subPanel = new JPanel(new FlowLayout());
		
      JPanel p4 = new JPanel(new BorderLayout());
      
      JTextField topTxt = new JTextField("",93);
		JLabel topLabel = new JLabel("TextFile:");
      
      JButton browseButton = new JButton("Browse");
		
		String[] file = {"Project Guten Burge File"};
		JComboBox types = new JComboBox(file); //Drop down menu
		JLabel fileType = new JLabel(" Text File Type:");
		
		
		JTextField tf = new JTextField("",48);
		JLabel label = new JLabel("Title:");
		JTextField tf2 = new JTextField("",48);
		JLabel label2 = new JLabel("Author:");
      
      JButton processButton = new JButton("Process");
		
      
		p1subPanel.add(topLabel);
		p1subPanel.add(topTxt);
      p1subPanel.add(browseButton);
      p1.add(p1subPanel, BorderLayout.WEST);
      
		p2.add(fileType, BorderLayout.WEST);
		p2.add(types, BorderLayout.CENTER);
      
		p3subPanel.add(label);
		p3subPanel.add(tf);
		p3subPanel.add(label2);
		p3subPanel.add(tf2);
		p3.add(p3subPanel, BorderLayout.WEST);
      
		p4.add(processButton, BorderLayout.WEST);
		
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
      
		MAINPANEL.add(panel); //added everything to main panel
		
		frame.getContentPane().add(MAINPANEL, BorderLayout.NORTH);
      
      //add text area to loadPanel
 		JTextArea textArea = new JTextArea(
			    "Opus: \n" +
			    "Title: \n" +
			    "Author: \n" +
			    "Opus Size: \n"+
             "Opus Number; \n"+
             "New Index terms: \n"+
             "New Postings: \n"+
             "Total Index terms: \n"+
             "Total Postings: \n"
			    
	   );
		JScrollPane sp = new JScrollPane(textArea);
		
		frame.getContentPane().add(sp, BorderLayout.CENTER);
   
   
   
   }
}