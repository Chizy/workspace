import java.awt.*;
 import javax.swing.*;
 import javax.swing.border.*;  // inneh�ller klasser f�r ramar
 
 public class JCompDemo extends JFrame {
	 JLabel l1;
	 
	 
	 
	 public JCompDemo(Color f�rg, String text1, String text2, String text3) { // Konstruktor f�r klassen JCompDemo

	 setLayout(new FlowLayout());
     getContentPane().setBackground(f�rg); 
     l1 = new JLabel(text1, JLabel.CENTER);     
     l1.setOpaque(true);        // ogenomskinlig bakgrund
     //l1.setBackground(Color.white);
     //l1.setForeground(Color.blue);
     l1.setFont(new Font("SansSerif", Font.BOLD, 24));
     JLabel l2 = new JLabel(text2, JLabel.CENTER);
     l2.setForeground(Color.black);
     l2.setFont(new Font("SansSerif", Font.PLAIN, 24));
     l2.setBorder(new EtchedBorder());
     JLabel l3 = new JLabel(text3, JLabel.CENTER);
     l3.setOpaque(true);        // ogenomskinlig bakgrund
     l3.setBackground(l1.getBackground());
     l3.setForeground(l1.getForeground());
     l3.setFont(new Font("SansSerif", Font.ITALIC, 24));
     l3.setPreferredSize(new Dimension(100,100));
     l3.setToolTipText("En samling grafiska komponenter");
     add(l1); add(l2); add(l3);
     pack();   // r�kna ut komponenternas och f�nstrets storlek
     setVisible(true);         // g�r f�nstret synligt 
     setDefaultCloseOperation(EXIT_ON_CLOSE); 
   }
	 
	 public JCompDemo(Color f�rg1, Color f�rg2){
		 
	     l1.setForeground(f�rg2);
	 }
	
   public static void main (String[] arg) {
     JCompDemo j = new JCompDemo(Color.CYAN, "Hej", "p�", "dig!");
   }
 }