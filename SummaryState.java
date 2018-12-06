import java.awt.*;
import javax.swing.*;

public class SummaryState extends JFrame{
   //constructor
   public SummaryState(){
      super();
      setLayout();
   }
   //Layout
   public void setLayout(){
      setSize(800,400);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      JLabel textBox = new JLabel("");
      JScrollPane scroll = new JScrollPane();
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      c.add(textBox);
      c.add(scroll);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public static void main(String[] args){
      SummaryState start = new SummaryState();
   }
}