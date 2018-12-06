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
      setLayout(new GridLayout());
      JLabel textBox = new JLabel("");
      textBox.setVerticalAlignment(JLabel.TOP);
      JScrollPane scroll = new JScrollPane(textBox);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      add(scroll);
   }
   public static void main(String[] args){
      SummaryState start = new SummaryState();
      JFrame window = new JFrame("Pirex");
      window.setSize(900,500);
      window.add(start);
      window.setVisible(true);
   }
}