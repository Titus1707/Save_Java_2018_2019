import java.util.*;

package resistor2;


public class resistor{
  public static void main(String[] args) {
        
        float val1 = 0,val2 = 0,multipl = 0,tol = 0,resultat;

       
        
        Scanner lectureClavier = new Scanner(System.in);
     
        
        float tolposs;
        float tolneg;
        
      String val;
      
        System.out.print("Entrer la premiÃ©re couleur : ");
        String phrase1; 
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
       
        switch (phrase1) { 
            case "Noir" : 
                System.out.println("La couleur est " + phrase1);
                System.out.println("Le noir est impossible en 1 Ã©re Couleur");
                
                break; 
            
            case "Marron" : 
                System.out.println("La couleur est" + phrase1);
                val1= 1;
                
                break;
                
            case "Rouge" : 
                System.out.println("La couleur est" + phrase1);
                val1=2;
                
                break;                 

            case "Orange" : 
                System.out.println("La couleur est" + phrase1);
                val1=3;
               
                break;  
                
            case "Jaune" : 
                System.out.println("La couleur est" + phrase1);
                val1=4;
                
                break; 
                
            case "Vert" : 
                System.out.println("La couleur est" + phrase1);
                val1=5;
                
                break;
                
            case "Bleu" : 
                System.out.println("La couleur est" + phrase1);
                val1=6;
                
                break;

            case "Violet" : 
                System.out.println("La couleur est" + phrase1);
                val1=7;
                
                break; 
                
            case "Gris" : 
                System.out.println("La couleur est" + phrase1);
                val1=8;
                
                break;
                
            case "Blanc" : 
                System.out.println("La couleur est" + phrase1);
                val1=9;
                
                break;
                
            case "Or" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Or est impossible en premiÃ©re position");
                
                break;
                
            case "Argent" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Argent est impossible en premiÃ©re position");
                
                break; 
                
            default : System.out.println("il y a une erreur"); 
        }// fin de switch 1
        
        
        
        System.out.print("Entrer la Seconde couleur : ");
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
        switch (phrase1) { 
            case "Noir" : 
                System.out.println("La couleur est " + phrase1);
                val2=0;
                break; 
            
            case "Marron" : 
                System.out.println("La couleur est" + phrase1);
                val2=1;
                break;
                
            case "Rouge" : 
                System.out.println("La couleur est" + phrase1);
                val2=2;
                break;                 

            case "Orange" : 
                System.out.println("La couleur est" + phrase1);
                val2=3;
                break;  
                
            case "Jaune" : 
                System.out.println("La couleur est" + phrase1);
                val2=4;
                break; 
                
            case "Vert" : 
                System.out.println("La couleur est" + phrase1);
                val2=5;
                break;
                
            case "Bleu" : 
                System.out.println("La couleur est" + phrase1);
                val2=6;
                break;

            case "Violet" : 
                System.out.println("La couleur est" + phrase1);
                val2=7;
                break; 
                
            case "Gris" : 
                System.out.println("La couleur est" + phrase1);
                val2=8;
                break;
                
            case "Blanc" : 
                System.out.println("La couleur est" + phrase1);
                val2=9;
                break;
                
            case "Or" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Or est impossible en premiÃ©re position");
                break;
                
            case "Argent" : 
                System.out.println("La couleur est" + phrase1);
                System.out.println("La couleur Argent est impossible en premiÃ©re position");
                break; 
                
            default : System.out.println("il y a une erreur"); 
        }// fin de switch 2
        
         System.out.print("Entrer la TroisiÃ©me couleur : ");
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
        switch (phrase1) { 
            case "Noir" : 
                System.out.println("La couleur est " + phrase1);
                multipl=1;
                break; 
            
            case "Marron" : 
                System.out.println("La couleur est" + phrase1);
                multipl=10;
                break;
                
            case "Rouge" : 
                System.out.println("La couleur est" + phrase1);
                multipl=100;
                break;                 

            case "Orange" : 
                System.out.println("La couleur est" + phrase1);
                multipl=1000;
                break;  
                
            case "Jaune" : 
                System.out.println("La couleur est" + phrase1);
                multipl=10000;
                break; 
                
            case "Vert" : 
                System.out.println("La couleur est" + phrase1);
                multipl=100000;
                break;
                
            case "Bleu" : 
                System.out.println("La couleur est" + phrase1);
                multipl=1000000;
                break;

            case "Violet" : 
                System.out.println("La couleur est" + phrase1);
                multipl=10000000;
                break; 
                
            case "Gris" : 
                System.out.println("La couleur est" + phrase1);
                multipl=100000000;
                break;
                
            case "Blanc" : 
                System.out.println("La couleur est" + phrase1);
                multipl=1000000000;
                break;
                
            case "Or" : 
                System.out.println("La couleur est" + phrase1);
                multipl=+10;
                break;
                
            case "Argent" : 
                System.out.println("La couleur est" + phrase1);
                multipl=+100;
                break; 
                
            default : System.out.println("il y a une erreur"); 
        }// fin de switch 3
        
System.out.print("Entrer la derniÃ©re couleur : ");
        phrase1 = lectureClavier.next();  // lire le premier mot 
        
        switch (phrase1) { 
            case "Noir" : 
                System.out.println("La couleur est " + phrase1);
                tol=0;
                break; 
            
            case "Marron" : 
                System.out.println("La couleur est" + phrase1);
                tol=1;
                break;
                
            case "Rouge" : 
                System.out.println("La couleur est" + phrase1);
                tol=2;
                break;                 

            case "Orange" : 
                System.out.println("La couleur est" + phrase1);
                tol=3;
                break;  
                
            case "Jaune" : 
                System.out.println("La couleur est" + phrase1);
                tol=4;
                break; 
                
            case "Vert" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.5;
                break;
                
            case "Bleu" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.25;
                break;

            case "Violet" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.10;
                break; 
                
            case "Gris" : 
                System.out.println("La couleur est" + phrase1);
                tol= (float) 0.05;
                break;
                
            case "Blanc" : 
                System.out.println("La couleur est" + phrase1);
                
                break;
                
            case "Or" : 
                System.out.println("La couleur est" + phrase1);
                tol=5;
                break;
                
            case "Argent" : 
                System.out.println("La couleur est" + phrase1);
                tol=10;
                break; 
                
            default : System.out.println("il y a une erreur");
           
            
        }// fin de switch 4    
        
        
       resultat = val1+val2*multipl ;
        System.out.println("La valeur est de"+resultat+"Ohms"+"la tolÃ©rance est de "+tol+"%" );
        
      tolposs = resultat +tol;
      System.out.println("La valeur avec la tolerance positive est de"+tolposs+"Ohms" );
      tolneg = resultat -tol;
      System.out.println("La valeur avec la tolerance nÃ©gative est de"+tolneg+"Ohms" );
      
      
     //  val = Integer.parseInt(resultat.charAt(0));
      
      //if (resultat == 1000){
     //System.out.println("La valeur avec la tolerance  est de"+resultat+"k OHMS" );
      
      //}
      
      
      //if (resultat < 1000){
     //System.out.println("La valeur avec la tolerance  est de"+resultat+"k OHMS" );
      
      //}
      
      
      // je n'ai pas r�usit � transformer le int en char avec parseInt , et a mettre le K l'orsqu'il y a plus de mille
    } 
  
  
    
}

