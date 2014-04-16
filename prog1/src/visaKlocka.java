import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class visaKlocka { //�ppen class + namn

    public static void main(String[] args) { //main metod, public, f�rst
       KlockVisare v = new KlockVisare();  // Skapa ett objekt + namn = KlockVisare
    } //main slut
} //class slut

class KlockVisare extends JFrame implements ActionListener { //Klockvisare �rver Jframe = ram och "lysnar p� handlingen"
  private Tidpunkt tp = new Tidpunkt(); //skapar ny tidpunkts objekt i tp och �r privat
  private JLabel l; //skapar privat Jlable i l

  public KlockVisare() { // Konstruktur, anropas automatiskt, public
      javax.swing.Timer tim = new javax.swing.Timer(1000, this); //skapar en timer, 1000 = 1 sec == k�rs 1 per sec
      tim.start();   // starta timern

      Calendar c = Calendar.getInstance(); //importerar Kalendern fr�n datorn

      tp.s�tt(c.get(Calendar.HOUR_OF_DAY), // imp timme
              c.get(Calendar.MINUTE),//imp min
              c.get(Calendar.SECOND));//imp sec

      l = new JLabel(tp.toString(), JLabel.CENTER); //ramen med Tidpunkt i

      getContentPane().add(l);  // Placera i f�nstret

      l.setOpaque(true);                    // Ogenomskinlig bakgrund
      l.setBackground(Color.black);
      l.setForeground(Color.white);
      l.setFont(new Font("SansSerif", Font.BOLD, 24));

      setSize(200, 75);                     // F�nstrets storlek
      setLocation( 200,200);                // F�nstrets placering
      setVisible(true);                     // G�r f�nstret synligt

      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) { //handlings metoden
          // Hit kommer man automatiskt 1 g�ng per sekund
      tp.ticka();
      l.setText(tp.toString());
    }
}