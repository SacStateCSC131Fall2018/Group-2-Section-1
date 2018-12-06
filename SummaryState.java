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
      //setSize(800,400);
      //Container c = getContentPane();
      this.setLayout(new BorderLayout());
      JLabel textBox = new JLabel("a\nadjf\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nasdfjklsdjf\n\n\n\nlaksdjfk",JLabel.LEFT);
      JScrollPane scroll = new JScrollPane(textBox);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      this.add(textBox, BorderLayout.CENTER);
      this.add(scroll, BorderLayout.EAST);
      //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //setVisible(true);
   }
   /*
   public static void main(String[] args){
      SummaryState start = new SummaryState();
   }*/
}