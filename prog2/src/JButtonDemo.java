 import java.awt.*;
 import java.awt.event.*;  // innehåller klasser för lyssnare
 import javax.swing.*;

 public class JButtonDemo extends JWindow implements ActionListener {
   private JLabel  lab = new JLabel("Welcome!", JLabel.CENTER);
   private JButton exi = new JButton("Cancel");
   private JButton eng = new JButton("In English, please!", new ImageIcon("flag_eng.gif"));
   private JButton swe = new JButton("På svenska, tack!", new ImageIcon("flag_swe.gif"));
   private JButton grå = new JButton("Gray");
   private JButton blå = new JButton("Blue");

   public JButtonDemo(Color A) {
	  this();	
	  lab.setBackground(A);
   }
   public JButtonDemo(Color A, Color B) {
	   this();	
	   lab.setBackground(A);
	   lab.setForeground(B);
   }
   
   public JButtonDemo() { // konstruktor för klassen JButtonDemo
	  setLayout(new GridLayout(3,2)); // 3 rader, 2 kolumner
      add(lab); add(exi); add(eng); add(swe); add(grå); add(blå);
      setBackground(Color.white);     // gör arbetsytan vit
      lab.setFont(new Font("SansSerif", Font.ITALIC, 20));
      exi.setFont(new Font("SansSerif", Font.BOLD, 14));
      // koppla lyssnare till knapparna
      exi.addActionListener(this);
      eng.addActionListener(this);
      swe.addActionListener(this);
      grå.addActionListener(this);
      blå.addActionListener(this);
      eng.setEnabled(false);    // engelska texter visas redan
      lab.setOpaque(true);
      setSize(350,150);
      setVisible(true); 
   }

   // lyssnarmetod
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == exi){
        System.exit(0);
      }
      else if (e.getSource() == eng) {
        lab.setText("Welcome!");
        exi.setText("Cancel");
        grå.setText("Gray");
        blå.setText("Blue");
        eng.setEnabled(false);
        swe.setEnabled(true);
      }
      else if (e.getSource() == swe) {
        lab.setText("Välkommen!");
        exi.setText("Avsluta");
        grå.setText("Grå");
        blå.setText("Blå");
        swe.setEnabled(false);
        eng.setEnabled(true);
      }
      else if (e.getSource() == grå) {
    	lab.setBackground(Color.gray);
    	lab.setForeground(Color.black);
      }
      else if (e.getSource() == blå) {
    	lab.setBackground(Color.blue);
    	lab.setForeground(Color.black);
      }
   }

   public static void main (String[] arg) {
      JButtonDemo j = new JButtonDemo(Color.cyan, Color.gray);
   }
 }