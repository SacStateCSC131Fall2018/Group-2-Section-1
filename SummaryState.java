import java.awt.*;
import javax.swing.*;

public class SummaryState extends JPanel{
   //constructor
   public SummaryState(){
      super();
      setLayout();
   }
   //Layout
   public void setLayout(){
      /*
      setSize(900,500);
      setVisible(true);
      Container c = getContentPane();
      */
      this.setLayout(new FlowLayout());
      JLabel textBox = new JLabel("");
      textBox.setVerticalAlignment(JLabel.TOP);
      JScrollPane scroll = new JScrollPane(textBox);
      scroll.setPreferredSize(new Dimension(800,400));
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      JTabbedPane tab = new JTabbedPane();
      tab.addTab("Summarize Document",scroll);
      this.add(tab);
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   /*
   public static void main(String[] args){
      SummaryState start = new SummaryState();
   }*/
}