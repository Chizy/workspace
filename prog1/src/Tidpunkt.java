public class Tidpunkt {
   
   private int t, m, s;
   private boolean visaSek = true;

   public Tidpunkt() {}

   public Tidpunkt(int tim, int min, int sek) {
     s�tt(tim, min, sek);
   }
   public Tidpunkt(int tim, int min) {
     this(tim, min, 0);
		  
   }
   public Tidpunkt(int tim) {
     this(tim, 0);
   }
   
   public void s�tt (int tim, int min, int sek) {
     
     if (tim>=0 && tim<24 && min>=0 && min<60 && sek>=0 && sek<60) {
       t=tim; m=min; s=sek;
     }
     else 
       System.out.println("Felaktig tidpunkt");
   }

   public void s�ttVisaSek(boolean visa) {
     visaSek = visa;
   }

   public int avl�sTim () {
     return t;
   }

   public int avl�sMin () {
     return m;
   }

   public int avl�sSek () {
     return s;
   }

   public String toString () { 
     String tid = String.format("%02d:%02d:%02d",t,m,s); 
     
     return tid;
   }

   public void ticka() {       
     s = s+1;
     if (s==60) {
       s = 0;
       m = m+1;
     }
     if (m==60) {
       m = 0;
       t = t+1;
     }
     if (t==24) 
       t=0;
   }

   public void ticka(int antalSek) {
     while (antalSek>0) {
       ticka();
       antalSek = antalSek - 1;
     }
   }

}