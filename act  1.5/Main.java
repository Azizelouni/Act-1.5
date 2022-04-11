public class Main{
   public static void main(String[] args) {

        Livre l1 = new Livre("Le petit prince","St Exupéry",10.40f, 50) ;
        Livre l2 = new Livre("Contes","Grimm",14.40f,254) ;
        l1.afficher();
        l2.afficher();
     
       

        BD b1 = new BD("Lucky Luke","Morris",10.40f, 45, true);
        BD b2 = new BD("Tintin","Herge",200.40f, 45, false) ;
        b1.afficher() ;
        b2.afficher() ;

     }

}
 