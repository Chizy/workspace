import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class visaKlocka { //öppen class + namn

    public static void main(String[] args) { //main metod, public, först
       KlockVisare v = new KlockVisare();  // Skapa ett objekt + namn = KlockVisare
    } //main slut
} //class slut

class KlockVisare extends JFrame implements ActionListener { //Klockvisare ärver Jframe = ram och "lysnar på handlingen"
  private Tidpunkt tp = new Tidpunkt(); //skapar ny tidpunkts objekt i tp och är privat
  private JLabel l; //skapar privat Jlable i l

  public KlockVisare() { // Konstruktur, anropas automatiskt, public
      javax.swing.Timer tim = new javax.swing.Timer(1000, this); //skapar en timer, 1000 = 1 sec == körs 1 per sec
      tim.start();   // starta timern

      Calendar c = Calendar.getInstance(); //importerar Kalendern från datorn

      tp.sätt(c.get(Calendar.HOUR_OF_DAY), // imp timme
              c.get(Calendar.MINUTE),//imp min
              c.get(Calendar.SECOND));//imp sec

      l = new JLabel(tp.toString(), JLabel.CENTER); //ramen med Tidpunkt i

      getContentPane().add(l);  // Placera i fönstret

      l.setOpaque(true);                    // Ogenomskinlig bakgrund
      l.setBackground(Color.black);
      l.setForeground(Color.white);
      l.setFont(new Font("SansSerif", Font.BOLD, 24));

      setSize(200, 75);                     // Fönstrets storlek
      setLocation( 200,200);                // Fönstrets placering
      setVisible(true);                     // Gör fönstret synligt

      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) { //handlings metoden
          // Hit kommer man automatiskt 1 gång per sekund
      tp.ticka();
      l.setText(tp.toString());
    }
}