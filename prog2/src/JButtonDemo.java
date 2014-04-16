 import java.awt.*;
 import java.awt.event.*;  // inneh�ller klasser f�r lyssnare
 import javax.swing.*;

 public class JButtonDemo extends JWindow implements ActionListener {
   private JLabel  lab = new JLabel("Welcome!", JLabel.CENTER);
   private JButton exi = new JButton("Cancel");
   private JButton eng = new JButton("In English, please!", new ImageIcon("flag_eng.gif"));
   private JButton swe = new JButton("P� svenska, tack!", new ImageIcon("flag_swe.gif"));
   private JButton gr� = new JButton("Gray");
   private JButton bl� = new JButton("Blue");

   public JButtonDemo(Color A) {
	  this();	
	  lab.setBackground(A);
   }
   public JButtonDemo(Color A, Color B) {
	   this();	
	   lab.setBackground(A);
	   lab.setForeground(B);
   }
   
   public JButtonDemo() { // konstruktor f�r klassen JButtonDemo
	  setLayout(new GridLayout(3,2)); // 3 rader, 2 kolumner
      add(lab); add(exi); add(eng); add(swe); add(gr�); add(bl�);
      setBackground(Color.white);     // g�r arbetsytan vit
      lab.setFont(new Font("SansSerif", Font.ITALIC, 20));
      exi.setFont(new Font("SansSerif", Font.BOLD, 14));
      // koppla lyssnare till knapparna
      exi.addActionListener(this);
      eng.addActionListener(this);
      swe.addActionListener(this);
      gr�.addActionListener(this);
      bl�.addActionListener(this);
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
        gr�.setText("Gray");
        bl�.setText("Blue");
        eng.setEnabled(false);
        swe.setEnabled(true);
      }
      else if (e.getSource() == swe) {
        lab.setText("V�lkommen!");
        exi.setText("Avsluta");
        gr�.setText("Gr�");
        bl�.setText("Bl�");
        swe.setEnabled(false);
        eng.setEnabled(true);
      }
      else if (e.getSource() == gr�) {
    	lab.setBackground(Color.gray);
    	lab.setForeground(Color.black);
      }
      else if (e.getSource() == bl�) {
    	lab.setBackground(Color.blue);
    	lab.setForeground(Color.black);
      }
   }

   public static void main (String[] arg) {
      JButtonDemo j = new JButtonDemo(Color.cyan, Color.gray);
   }
 }