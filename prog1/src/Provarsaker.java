

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class Provarsaker extends JFrame implements ActionListener {
  private Spelplan plan = new Spelplan(); 
  private JLabel poäng1 = new JLabel("0", JLabel.CENTER); 
  private JLabel liven = new JLabel("0", JLabel.CENTER);
  private JPanel pan    = new JPanel(); 
  private JButton[] b   = new JButton[4]; 
  private String[] s ={"Nytt spel","Paus","Fortsätt","Avsluta"};

  public Provarsaker() { 
    setTitle("Tennis"); 
    plan.setPreferredSize(new Dimension(350,250));
    plan.setBackground(Color.white); 
    poäng1.setFont(new Font("SansSerif", Font.BOLD, 24)); 
    liven.setFont(new Font("SansSerif", Font.BOLD, 24)); 
    pan.setLayout(new FlowLayout()); 
    for (int i=0; i<b.length; i++) { 
      b[i] = new JButton(); 
      b[i].setText(s[i]);  
      b[i].addActionListener(this); 
      pan.add(b[i]); 
    } 
    add(plan, BorderLayout.CENTER); 
    add(poäng1, BorderLayout.WEST); 
    add(liven, BorderLayout.EAST); 
    add(pan, BorderLayout.NORTH);
    pack(); 
    plan.init(poäng1, liven); 
    setVisible(true); 
  } 

  public void actionPerformed(ActionEvent e) { 
    plan.requestFocus(); 
    if (e.getSource() == b[0]) 
      plan.nyttSpel(); 
    else if (e.getSource() == b[1])   
      plan.stoppaSpel(); 
    else if (e.getSource() == b[2]) 
      plan.startaSpel(); 
    else if (e.getSource() == b[3]) 
      System.exit(0); 
  } 

  public static void main(String[] arg) { 
    Provarsaker s = new Provarsaker(); 
  } 
}

class Spelplan extends JPanel implements ActionListener { 
  private Timer tim = new Timer(17, this); 
  private JLabel poäng1, liven; // för att visa poäng 
  private int p1;
  private int liv=3;            // aktuella poäng 
  private int xMax, yMax;        // högsta x- och y-koordinat 
  private int r, x0, y0;         // bollens radie och mittpunkt 
  private double xSteg = 1; 
  private double ySteg = 2;      // bollens steglängd 
  private double v0 = 5;
  private double Vy = 2;
  private double Vx = 1;         // bollens hastighet 
  private double g = 0.075; //gravitationen
  private int t = 1;   //tiden
  private int a = 80;  //vinkeln
  private int rK,          // rackets övre kant
              rL, rSteg;         // rackets längd och steglängd

  public void init(JLabel l1, JLabel l2) { 
    poäng1 = l1; liven = l2; 
    xMax = getSize().width-1; 
    yMax = getSize().height-1; 
    r  = yMax/20;   // beräkna bollens radie 
    rL = 3*r;       // beräkna rackets längd 
    rSteg = r;      // beräkna rackets steglängd 
    addKeyListener(kl);        // lyssna på tangentbordet och 
    addComponentListener(cl);  // ändringar av planens storlek 
    nollställ();  
  } 

  private void nollställ() { 
    p1 = 0;
    liv = 3;      // nollställ liv 
    poäng1.setText(" 0 "); 
    liven.setText(" 3 "); 
    xSteg = 1;
    ySteg = 2;
    t = 1;
    a = 80;
    Vy = 2;
    Vx = 1;        // utgångshastighet 
    x0 = xMax/2;             // sätt bollen i vänsterkanten 
    y0 = yMax-r;              // i mitten av kortsidan 
    rK = xMax/2-rL/2;    // placera racketarna i mitten 
  }
  
  private void nyttliv() {
	  Vy = 2;
	  Vx = 1;
	  v0 = 5;
	  xSteg = 1;
	  ySteg = 2;
	  x0 = xMax/2;
	  y0 = yMax-r;
	  rK = xMax/2-rL/2;
  }

  public void startaSpel() { 
    tim.start(); 
  } 

  public void stoppaSpel() { 
    tim.stop(); 
  } 

  public void nyttSpel() { 
    stoppaSpel(); nollställ(); startaSpel(); 
  } 

  public void actionPerformed(ActionEvent e) { 
    // hit kommer man var 100:e millisekund, anropas av timern
    if (y0+r>=yMax)  {            // är bollen i underkanten? 
      if (x0 < rK || x0 > rK+rL) { // miss? 
          liv=liv-1;
          liven.setText(" " + String.valueOf(liv) + " ");
          nyttliv();
          if(liv==0){
        	  stoppaSpel(); 
          }
      } 
      else {      // träff 
    	Toolkit.getDefaultToolkit().beep();   // plinga 
      poäng1.setText(" " + String.valueOf(++p1) + " "); 
         // öka hastigheten 
      
      t = 1;      
      }
    }
    
    
    if (x0+r >= xMax || x0-r <= 0){ // i höger- eller vänsterkanten? 
        xSteg = -xSteg;          // byt vertikal riktning 
    }
    
    Vy = (v0 * Math.sin(a))+(g*t);
    ySteg = Vy;
    x0 += xSteg;  // flytta bollen horisontellt 
    y0 += ySteg;  // flytta bollen vertikalt 
    t = t + 1;
    
    if (x0 < r)   // hamnade bollen för långt åt vänster? 
      x0 = r; 
    else if (x0 > xMax-r) // hamnade bollen för långt åt höger? 
      x0 = xMax-r+1;
    if (y0 < r)            // hamnade bollen för långt upp? 
      y0 = r; 
    else if (y0 > yMax-r)  // hamnade bollen för långt ner? 
      y0 = yMax-r+1; 
    repaint(); 
  } 

  @Override
  public void paintComponent(Graphics g) { 
    super.paintComponent(g); 
    g.setColor(Color.red); 
    g.fillOval(x0-r, y0-r, 2*r, 2*r); // rita bollen  
    g.setColor(Color.black); 
    g.fillRect(rK, yMax, rL, 2); 
  } 

  KeyListener kl = new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) { 
      // någon tangent har tryckts ner 
      if (e.getKeyCode() == KeyEvent.VK_LEFT)        // höger upp 
        rK = Math.max(0, rK-rSteg); 
      else if (e.getKeyCode() == KeyEvent.VK_RIGHT) // höger ner 
        rK = Math.min(xMax-rL, rK+rSteg);  
    } 
  }; 

  ComponentListener cl = new ComponentAdapter() {
    @Override
    public void componentResized(ComponentEvent e) { 
      // spelplanens storlek har ändrats 
      xMax = e.getComponent().getSize().width-1; 
      yMax = e.getComponent().getSize().height-1; 
      e.getComponent().requestFocus(); 
      repaint(); 
    } 
  };     
}


