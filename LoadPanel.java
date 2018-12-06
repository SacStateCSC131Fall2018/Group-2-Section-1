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
		JPanel panel = new JPanel(new GridLayout(3,0)); //this panel creates a grid holds three panels
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new BorderLayout());
		JPanel p3 = new JPanel(new FlowLayout());
		
		JTextField topTxt = new JTextField("",30);
		JLabel topLabel = new JLabel("TextFile:");
		
		String[] file = {"Project Guten Burge File"};
		JComboBox types = new JComboBox(file); //Drop down menu
		JLabel fileType = new JLabel("Text File Type:");
		
		
		JTextField tf = new JTextField("",12);
		JLabel label = new JLabel("Title:");
		JTextField tf2 = new JTextField("",12);
		JLabel label2 = new JLabel("Author:");
		
		p1.add(topLabel);
		p1.add(topTxt);
      
		p2.add(fileType, BorderLayout.WEST);
		p2.add(types, BorderLayout.CENTER);
      
		p3.add(label);
		p3.add(tf);
		p3.add(label2);
		p3.add(tf2);
      
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
      
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