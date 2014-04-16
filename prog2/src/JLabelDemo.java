import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.*;
import java.net.*;
 
public class JLabelDemo extends JFrame implements MouseListener {
	
	public  JLabel l1;  
   
	public  JLabel l2;
	
	public JLabel l11;
	public JLabel l12;
	public JLabelDemo() {
 	
 	
 	setLayout(new GridLayout(2,5));
 	
 	 l1 = new JLabel("vanlig text");
 	l2 = new JLabel (new ImageIcon("button.gif"));
 	
 	URL u =null; 
 	URL u2 =null;
 	URL u3 =null;
 	
 	try { u = new URL("http://metrobloggen.se/metrobloggen/media/5014/snobben_l.gif");}

 	  
    catch (MalformedURLException e){
    		
    }
 	try { u2 = new URL("http://metrobloggen.se/metrobloggen/media/5014/charmmykitty(1).gif");}

	  
    catch (MalformedURLException e){
    		
    }
 	try { u3 = new URL("http://metrobloggen.se/metrobloggen/media/5014/prettypink.jpg");}

	  
    catch (MalformedURLException e){
    		
    }
	
	JLabel l3 = new JLabel(new ImageIcon(u));
	l3.setToolTipText("Detta är en ImageIcon");
	
	JLabel  l4 = new JLabel(new ImageIcon("button.gif"),JLabel.RIGHT); 
		
	l4.setVerticalAlignment(JLabel.BOTTOM);
	
	JLabel l5 = new JLabel ("arbete pågår", new ImageIcon("button.gif"),JLabel.RIGHT);
	
	l5.setHorizontalTextPosition(JLabel.CENTER);
	l5.setVerticalTextPosition(JLabel.BOTTOM);  
    
   	JLabel l6 = new JLabel ("hej",new ImageIcon("button.gif"),JLabel.LEFT);
    l6.setVerticalAlignment(JLabel.BOTTOM);
    l6.setHorizontalTextPosition(JLabel.RIGHT);
    
    
	JLabel l7 = new JLabel ("arbete pågår", new ImageIcon("button.gif"),JLabel.RIGHT );
    l7.setLayout(new GridLayout(1,1));
    l7.add(new JLabel("bakgrundsbild"));
    
    JLabel l8 = new JLabel(
    	"<html><body><b>html_text</b>"+
    	"<p> med <i>olika</i><u>stil</u><small>och</small>"+
    	"<big> storlek</big></body></html>");
    	
    JLabel l9 = new JLabel(new ImageIcon(u2));
    JLabel l10 = new JLabel(new ImageIcon(u3));
    l11 = new JLabel();
    l11.addMouseListener(this);
    
    l12 = new JLabel();
    l12.addMouseListener(this);
    
    
    EtchedBorder e = new EtchedBorder();
    l1.setBorder(e);
    l2.setBorder(e);
    l3.setBorder(e);
    l4.setBorder(e);
    l5.setBorder(e);
    l6.setBorder(e);
    l7.setBorder(e);
    l9.setBorder(e);
    l10.setBorder(e);
    l11.setBorder(e);
    l12.setBorder(e);
    
    add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);
    add(l7);
    add(l8);
    add(l9);
    add(l10);
    add(l11);
    add(l12);
    
    setSize(450,300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
    public void nyText(){
    	
    	l1.setText("ändrad via metod");
    	
    }
    
    public void nyBakgrund(){
    	
    	l1.setBackground(Color.BLUE);
    	
    }
    
    
    public static void main(String[] args) {
    
    JLabelDemo j = new JLabelDemo();
    
    
   
    
   j.l2.setText(j.l1.getText());
    }
	@Override
	public void mouseClicked(MouseEvent e) {
	
		if (e.getSource()==l12){
			

			nyBakgrund();
			 
	
			
		}
		if (e.getSource()==l11){
			
			nyText();
			
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}