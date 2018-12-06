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
      this.setLayout(new BorderLayout());
      //JPanel MAINPANEL = new JPanel();  // This panel is the mail panel and holds all the other panels
		JPanel panel = new JPanel(new GridLayout(3,0)); //this panel creates a grid holds three panels
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		JPanel p3 = new JPanel(new FlowLayout());
		
		JTextField topTxt = new JTextField("",30);
		JLabel topLabel = new JLabel("TextFile:");
		JButton browseButton = new JButton("Browse");
		
		String[] file = {"Project Guten Burge File"};
		JComboBox types = new JComboBox(file); //Drop down menu
		JLabel fileType = new JLabel("Text File Type:");
		
		
		JTextField tf = new JTextField("",12);
		JLabel label = new JLabel("Title:");
		JTextField tf2 = new JTextField("",12);
		JLabel label2 = new JLabel("Author:");
		
		p1.add(topLabel);
		p1.add(topTxt);
		p1.add(browseButton);
		
		p2.add(fileType);
		p2.add(types);
		
		p3.add(label);
		p3.add(tf);
		p3.add(label2);
		p3.add(tf2);
		
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		//MAINPANEL.add(panel); //added everything to main panel
		
		this.add(MAINPANEL, BorderLayout.NORTH);
   }
}
