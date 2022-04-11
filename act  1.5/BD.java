public class BD extends Livre{
   private boolean couleur;
   // private boolean sens;
   
 public BD(){
  this.couleur = true;
  }

 public BD(String titre, String auteur, float prix, int nombreDePages, boolean couleur){
  super(titre,auteur,prix,nombreDePages);
  this.couleur = couleur;
  // this.sens = sens;
  }

 public void afficher(){
  
  super.afficher();
  if(couleur == true){
  System.out.println("les pages sont en couleur");
   }
  else{
  System.out.println("les pages sont en noir et blanc");
   }
  System.out.println("Se lit de gauche à droite");
 
}}